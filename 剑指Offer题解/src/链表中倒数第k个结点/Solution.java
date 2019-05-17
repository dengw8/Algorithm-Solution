package 链表中倒数第k个结点;

import java.util.Stack;

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null || k == 0) return null;
        Stack<ListNode> list = new Stack<>();
        int count = 0;
        while(head != null) {
            count++;
            list.push(head);
            head = head.next;
        }
        if(count < k) return null;
        while((k - 1) != 0 && count > 0) {
            count--;
            list.pop();
            k--;
        }
        return list.peek();
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
