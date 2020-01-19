package base;

/**
 * @description: 公司
 **/
public class BObserver implements Observer{
    @Override
    public void update(String type) {
        if(type.equals("蒙蒙细雨")){
            System.out.println("公司接收到蒙蒙细雨的消息决定：按时上班");
        }else if(type.equals("狂风暴雨")){
            System.out.println("公司接收到狂风暴雨的消息决定：上班延迟");
        }
    }

    @Override
    public String getName() {
        return "公司";
    }
}
