package 链表中环的入口结点;

public class Main {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null) return null;

        ListNode temp = pHead, p = pHead;
        while(p != null) {
            temp = p;
            p = p.next;
            temp.next = null;
        }
        return temp;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
