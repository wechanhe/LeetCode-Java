package main.LinkedList;

import main.util.ListNode;

/**
 * question: 两个单链表有一部分相交，找出相交的节点
 * solution:
 * discussion:
 */
public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        ListNode a = headA, b = headB;
        while (a != b){
            a = (a == null)? headB : a.next;
            b = (b == null)? headA : b.next;
        }
        return a;
    }
}
