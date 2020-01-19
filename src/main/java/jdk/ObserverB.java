package jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 具体观察者B
 **/
public class ObserverB implements Observer{
        @Override
        public void update(Observable o, Object arg) {
            if(arg.equals("蒙蒙细雨")){
                System.out.println("公司接收到蒙蒙细雨的消息决定：按时上班");
            }else if(arg.equals("狂风暴雨")){
                System.out.println("公司接收到狂风暴雨的消息决定：上班延迟");
            }
        }

    public String getName() {
        return "公司";
    }
}
