package main.LinkedList;

import main.util.ListNode;

/**
 * question: 删除单链表指定的节点
 * solution:
 * discussion:
 */
public class Solution_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
