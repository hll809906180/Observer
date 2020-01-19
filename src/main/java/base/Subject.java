package base;

/**
 * @description: 抽象主题
 **/
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
     void attach(Observer observer);

    /**
     * 注销观察者
     * @param observer
     */
     void detach(Observer observer);

    /**
     * 通知所有注册过观察者
     */
    void notifyObserver();

    /**
     * 修改主题状态
     * */
    void change(String newstate);
}
