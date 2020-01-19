package base;

/**
 * @description: 学校
 **/
public class AObserver implements Observer{

    @Override
    public void update(String type) {
            if (type.equals("蒙蒙细雨")) {
                System.out.println("学校接收到蒙蒙细雨的消息决定：早操取消");
            } else if (type.equals("狂风暴雨")) {
                System.out.println("学校接收到狂风暴雨的消息决定：放假");
            }
          double i = 1/0;
    }

    @Override
    public String getName() {
        return "学校";
    }

}

