package 两个链表的第一个公共结点;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) return null;
        Stack<ListNode> st1 = new Stack<>();
        Stack<ListNode> st2 = new Stack<>();

        while(pHead1 != null) {
            st1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null) {
            st2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode node = null;
        while(!st1.isEmpty() && !st2.isEmpty() && st1.peek().val == st2.peek().val) {
            node = st1.peek();
            st1.pop();
            st2.pop();
        }
        return node;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
