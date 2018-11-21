package main.LinkedList;

import main.util.ListNode;

/**
 * question: 在链表删除指定的元素
 * solution:
 * discussion:
 */
public class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null)
            return null;
        ListNode p = head, q = head.next;
        while (q != null){
            if (q.val == val){
                p.next = q.next;
                q = q.next;
            }else {
                p = q;
                q = q.next;
            }
        }
        return head;
    }
}
