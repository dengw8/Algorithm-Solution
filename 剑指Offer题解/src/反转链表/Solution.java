package 反转链表;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        // pre和pos分别为链表翻转前head的前一个节点和后一个节点
        ListNode pre = null, pos;
        while(head != null) {
            pos = head.next;
            head.next = pre;
            pre = head;
            head = pos;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}