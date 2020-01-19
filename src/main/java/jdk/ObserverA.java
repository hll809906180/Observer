package jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 具体观察者
 **/
public class ObserverA implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        if (arg.equals("蒙蒙细雨")) {
            System.out.println("学校接收到蒙蒙细雨的消息决定：早操取消");
        } else if (arg.equals("狂风暴雨")) {
            System.out.println("学校接收到狂风暴雨的消息决定：放假");
        }
        double i = 1/0;
    }

    public String getName() {
        return "学校";
    }
}
