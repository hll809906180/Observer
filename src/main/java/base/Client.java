package base;

import java.util.ArrayList;

/**
 * @description: 客户端
 **/
public class Client {
    public static void main(String[] args) {
        // 创建主题对象
        Subject subject = new ConcreteSubject();
        // 创建A观察者对象(学校)
        Observer observerA = new AObserver();
        // 创建B观察者对象（公司）
        Observer observerB = new BObserver();

        // 将观察者对象注册到主题对象上
        subject.attach(observerA);
        subject.attach(observerB);

       /* subject.detach(observerB);*/

        //狂风暴雨 /蒙蒙细雨
        subject.change("蒙蒙细雨");

    }
}
