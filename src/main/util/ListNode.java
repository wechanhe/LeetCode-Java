package main.util;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; this.next=null;}
    public String toString(){
        return Integer.toString(val);
    }

    private static int[] StrToIntArray(String str) {
        str = str.substring(1, str.length() - 1);
        String []strs = str.split(",");
        int []arr = new int[strs.length];

        for (int i = 0; i < arr.length; i++) {
            if (strs[i].equals("null")) {
                arr[i] = Integer.MAX_VALUE;
            } else {
                arr[i] = Integer.parseInt(strs[i]);
            }
        }

        return arr;
    }

    // String str = "[3,9,20,null,null,15,7]";
    // 构造不带头节点的单项链表
    public static ListNode mkLinkedList(String str) {
        int []arr = StrToIntArray(str);
        ListNode head = null, p = null, q = null;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < Integer.MAX_VALUE && arr[i] > Integer.MIN_VALUE) {
                ListNode node = new ListNode(arr[i]);
                if (0 == i){
                    head = node;
                    p = head;
                }else {
                    p.next = node;
                    p = node;
                }
            }
        }
        return head;
    }

    public void visit(TreeNode t){
        if (t != null){
            System.out.print(t.val);
            visit(t.left);
            visit(t.right);
        }
    }
}