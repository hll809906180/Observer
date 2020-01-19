package dataStruct.stack;

/**
 * TODO: 栈 接口
 *
 * @author h.l
 * @date Created in 2019/8/29 15:44
 */
public interface IStack<T> {
    /**
     * 入栈
     * @param item
     */
    void push(T item);

    /**
     * 出栈
     * @return
     */
    T pop();

    /**
     * 返回栈顶元素
     * @return
     */
    T peek();

    /**
     * 栈是否为空
     * @return
     */
    boolean isEmpty();
    /**
     * 栈大小
     * @return
     */
    int size();
}
