package dataStruct.stack;

/**
 * TODO: 类描述
 *
 * @author h.l
 * @date Created in 2019/8/29 16:51
 */
public class StackTest {
    public static void main(String[] args) {
//        IStack<Integer> stack = new StackByList<Integer>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
      IStack<Integer> stack = new StackByArray<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
