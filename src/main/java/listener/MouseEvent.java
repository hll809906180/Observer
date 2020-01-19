package listener;

import java.util.EventObject;

/**
 * @program: Observer
 * @description: 鼠标事件
 * @author: Mr.he
 * @create: 2018-12-20 16:44
 **/
public class MouseEvent extends EventObject {

    private String status;

    public MouseEvent(Object source) {
        super(source);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
