package dataStruct.stack;

/**
 * TODO: 栈的实现 （存储结构：链式存储）
 *
 * @author h.l
 * @date Created in 2019/8/29 15:44
 */
public class StackByLinked<T> implements IStack<T>{
    //栈顶
    private Node<T> top;

    @Override
    public void push(T item) {
        Node<T> t =new Node<T>(item);
        //新栈顶的next域指向旧栈顶
        t.next = top;
        top = t;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }else{
            T item = top.data;
            //栈顶下移
            top = top.next;
            return item;
        }
    }

    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }else{
            return top.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }else{
            boolean sign = true;
            Node<T> node = top;
            int size = 1;
            while (sign){
                if(node.next!=null){
                    node = node.next;
                    size++;
                }else {
                    sign = false;
                }
            }
            return size;
        }
    }
}
