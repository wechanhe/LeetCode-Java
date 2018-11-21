package main.LinkedList;

import main.util.ListNode;

/**
 * question:
 * solution:
 * discussion:
 */
public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode p = head, q = head.next;
        while (q != null){
            if (q.next == p || q.next == head)
                return true;
            p = q;
            q = q.next;
        }
        return false;
    }
}
