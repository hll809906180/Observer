package jdk;

import java.util.Observable;

/**
 * @description: 具体主题
 **/
public class Subject extends Observable {
    /**
     *主题状态
     * */
    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        //改变通知者的状态
        setChanged();
        //调用父类Observable方法，通知所有观察者
        notifyObservers(state);
    }
}
