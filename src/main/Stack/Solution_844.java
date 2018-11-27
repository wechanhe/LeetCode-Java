package main.Stack;

import java.util.Stack;

/**
 * question: 判断两个字符串是否相等，#代表退格
 * solution: Stack
 * discussion:
 */
public class Solution_844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>(), stackT = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#')
                stackS.push(S.charAt(i));
            else if (stackS.empty())
                continue;
            else stackS.pop();
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#')
                stackT.push(T.charAt(i));
            else if (stackT.empty())
                continue;
            else stackT.pop();
        }
//        while (!stackS.empty() && !stackT.empty()){
//            if (stackS.pop() != stackT.pop())
//                return false;
//        }
//        if (!stackS.empty() || !stackT.empty())
//            return false;
        if (!String.valueOf(stackS).equals(String.valueOf(stackT).toString()))
            return false;
        return true;
    }
}
