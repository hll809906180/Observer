package dataStruct.stack;

import java.util.ArrayList;

/**
 * TODO: 栈的实现  （存储结构：顺序存储）
 *
 * @author h.l
 * @date Created in 2019/8/29 17:05
 */
public class StackByArray<T> implements IStack<T>{
    //栈容器
    private  ArrayList<T> array = new ArrayList<T>();
    //栈顶索引
    private int topIndex = -1;

    @Override
    public void push(T item) {
        array.add(item);
        topIndex++;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }else{
            T top = array.get(topIndex);
            array.remove(top);
            topIndex--;
            return  top;
        }
    }

    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }else{
            return  array.get(topIndex);
        }
    }

    @Override
    public boolean isEmpty() {
        if(topIndex == -1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return array.size();
    }
}
