package listener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Observer
 * @description: 事件源
 * @author: Mr.he
 * @create: 2018-12-20 16:41
 **/
public class EventSource {
    /**
     * 监听器容器
     */
    private List<MouseListener> statusListeners = new ArrayList<>();

    /**
     * 注册监听器
     * @param listener
     */
    public void addStatusListener(MouseListener listener) {
        statusListeners.add(listener);
    }

    public void onClick() {
        MouseEvent event = new MouseEvent(this);
        event.setStatus("单击");
        notifyListener(event);
    }

    public void onDoubleClick() {
        MouseEvent event = new MouseEvent(this);
        event.setStatus("双击");
        notifyListener(event);
    }

    public void onMove() {
        MouseEvent event = new MouseEvent(this);
        event.setStatus("移动");
        notifyListener(event);
    }

    private void notifyListener(MouseEvent event) {
        Iterator<MouseListener> it = statusListeners.iterator();
        while(it.hasNext()) {
            MouseListener listener = it.next();
            listener.changeStatus(event);
        }
    }
}
