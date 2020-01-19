package dataStruct.queue;

/**
 * TODO: 队列接口
 *
 * @author h.l
 * @date Created in 2019/8/29 17:34
 */
public interface IQueue<E> {
    /**
     * 队列大小
     * @return
     */
    int size();
    /**
     * 入队列
     * @param item
     * @return
     */
    void inQueue(E item);
    /**
     * 出队列
     * @return
     */
    E outQueue();
    /**
     * 队头元素
     * @return
     */
    E front();
    /**
     * 队尾元素
     * @return
     */
    E rear();

}
