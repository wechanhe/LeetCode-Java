package main.HashTable;

import main.util.TreeNode;

/**
 * question: 合并两个二叉树，其中对应节点加和，新节点加到新树
 * solution: 递归
 * discussion:
 */
public class Solution_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)return null;

        int val = (t1 == null?0:t1.val) + (t2 == null?0:t2.val);
        TreeNode newNode = new TreeNode(val);

        newNode.left = mergeTrees(t1 == null?null:t1.left, t2 == null?null:t2.left);
        newNode.right = mergeTrees(t1 == null?null:t1.right, t2 == null?null:t2.right);

        return newNode;
    }
}
