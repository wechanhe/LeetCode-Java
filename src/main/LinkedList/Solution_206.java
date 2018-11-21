package main.LinkedList;

import main.util.ListNode;

/**
 * question: 链表逆序
 * solution:
 * discussion:
 */
public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head, q = head.next;
        while (q != null){
            ListNode l = q.next;
            q.next = p;
            p = q;
            q = l;
        }
        head.next = null;
        return p;
    }
}
