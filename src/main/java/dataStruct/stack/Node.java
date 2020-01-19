package dataStruct.stack;

/**
 * TODO: 节点元素
 *
 * @author h.l
 * @date Created in 2019/8/29 15:50
 */
public class Node<T> {

    public Node<T> next;

    public T data;

    public Node(T _data){
        data = _data;
    }
}
