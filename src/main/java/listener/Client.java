package listener;

/**
 * @program: Observer
 * @description: 测试实例
 * @author: Mr.he
 * @create: 2018-12-20 16:58
 **/
public class Client {

    public static void main(String[] args) {
        //创建事件源
        EventSource source = new EventSource();
        //事件源添加监听器
        source.addStatusListener(new MouseListener(){
            @Override
            public void changeStatus(MouseEvent event) {
                System.out.println(event.getStatus());
            }
        });

        //事件源触发时间
        source.onClick();
        source.onDoubleClick();
        source.onMove();
    }
}
