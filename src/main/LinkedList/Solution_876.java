package main.LinkedList;

import main.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * question: 单链表返回中间节点
 * solution:
 * discussion:
 */
public class Solution_876 {
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode middle = head;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        System.out.println(list.size()/2);
        while (i < list.size()/2){
            i++;
            middle = middle.next;
        }
        return middle;
    }
}
