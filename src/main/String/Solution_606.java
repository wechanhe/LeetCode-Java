package main.String;

import main.util.*;

/**
 * Created by wche on 2018/10/26
 * question: 给定一颗二叉树，求先序遍历，子节点用()表示
 * solution: 递归
 * discussion:
 */
public class Solution_606 {
    public String tree2str(TreeNode t) {
        String res = "";
        if (t != null) {
            res += t.val;
            if (t.left != null || t.right != null)
                res += "(" + tree2str(t.left) + ")";
            if (t.right != null)
                res += "(" + tree2str(t.right) + ")";
        }
        return res;
    }
    public String discuss(TreeNode t){
        if (t == null)return "";

        String result = t.val + "";

        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (left == "" && right == "")return result;
        if (left == "")return result + "()" +"(" + right + ")";
        if (right == "")return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }
}

