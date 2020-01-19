package mst;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @description:
 * @author: he.l
 * @create: 2019-04-03 14:57
 **/
public class MST01 {
    public static  String replaceSpace(String str) {
        return  str.replaceAll("\\s+","%20");
    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return  null;
    }

    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHeads(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }




    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
