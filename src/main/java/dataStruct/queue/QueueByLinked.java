package dataStruct.queue;


/**
 * TODO: 对历实现
 *
 * @author h.l
 * @date Created in 2019/8/29 17:46
 */
public class QueueByLinked<E> implements IQueue<E>{
    //队列大小
    private int size = 0;

    //队首
    private Node<E> first;

    //队尾
    private Node<E> last;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void inQueue(E item) {
        if(null==last){
            last=(first = new Node<E>(null,null,item));
        }else{
            Node<E> newNode = new Node<E>(last,null,item);
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public E outQueue() {
        if(null==first){
            return null;
        }else{
            Node<E> newFirst = first.getNext();
            first = newFirst;
            if(null==newFirst){
                last = null;
            }
            size--;
            return first.getItem();
        }
    }

    @Override
    public E front() {

        return null;
    }

    @Override
    public E rear() {
        return null;
    }
}
