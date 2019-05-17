package 从尾到头打印链表;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode != null)  {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}