package dataStruct.queue;

import java.util.LinkedList;

/**
 * TODO: 节点
 *
 * @author h.l
 * @date Created in 2019/8/30 14:58
 */
public class Node<E> {
    private Node<E> pre;
    private Node<E> next;
    private E item;

    public Node(Node<E> pre, Node<E> next, E item) {
        this.pre = pre;
        this.next = next;
        this.item = item;
    }

    public Node<E> getPre() {
        return pre;
    }

    public void setPre(Node<E> pre) {
        this.pre = pre;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
