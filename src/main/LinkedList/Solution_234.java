package main.LinkedList;

import main.util.ListNode;

import java.util.Stack;

/**
 * question: 判断单链表是否回文，要求时间O(n)，空间O(1)
 * solution: stack, Time:O(n), Space:O(1)
 * discussion:
 */
public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if (head == null)return true;
        ListNode p = head, q = null;
        while (p != null){
            stack.push(p);
            p = p.next;
        }
        p = head;
        while (!stack.empty()){
            q = stack.pop();
            if (p.val != q.val)return false;
            p = p.next;
        }
        return true;
    }
}
