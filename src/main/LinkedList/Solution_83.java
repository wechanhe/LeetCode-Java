package main.LinkedList;

import main.util.ListNode;

/**
 * question: 删除有序单链表的重复元素
 * solution:
 * discussion:
 */
public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head, q = head;
        while (q != null){
            if (q.val != p.val){
                p.next = q;
                p = q;
                q = q.next;
            }else {
                q = q.next;
            }
        }
        if (p != null)
            p.next = q;
        return head;
    }
}
