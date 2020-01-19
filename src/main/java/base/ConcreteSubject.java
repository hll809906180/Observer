package base;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * @description: 具体主题(天气预报)
 **/
public class ConcreteSubject implements Subject{
    /**
     * 观察者对象的集合
     */
     private List<Observer> observerList = new ArrayList<Observer>();
    /**
     *主题状态
     * */
    private String state;

    /**
     * 注销观察者
     * @param observer
     */
    @Override
    public synchronized void detach(Observer observer) {
        observerList.remove(observer);
        System.out.println("删除观察者：" + observer.getName());
    }

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public synchronized void attach(Observer observer) {
        observerList.add(observer);
        System.out.println("增加观察者：" + observer.getName());
    }

    /**
     * 通知
     */
    @Override
    public void notifyObserver() {
        for(final Observer observer:observerList){
           // observer.update(state);
          // 异步通知
           new Thread() {
                @Override
                public void run() {
                    observer.update(state);
                }
            }.start();
        }
    }

    /**
     * 调用此方法更新主题状态
     * @param newstate
     */
    @Override
    public void change(String newstate){
        state = newstate;
        this.notifyObserver();
    }
}
