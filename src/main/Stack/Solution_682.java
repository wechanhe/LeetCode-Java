package main.Stack;

import java.util.Stack;

/**
 * question: 记分，有四种字符：数字，+，C，D
 * solution:
 * discussion:
 */
public class Solution_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < ops.length; i++) {
            char ch = ops[i].charAt(0);
            if (ch >= '0' && ch <= '9'){
                int value = Integer.parseInt(ops[i]);
                stack.push(value);
                res += value;
            }else if(ch == 'C'){
                if (stack.empty())return -1;
                int value = stack.pop();
                res -= value;
            }else if (ch == 'D'){
                if (stack.empty())return -1;
                int value = stack.peek()*2;
                stack.push(value);
                res += value;
            }else if (ch == '+'){
                int x = -1, y = -1;
                if (stack.empty()) {
                    return -1;
                }else{
                    x = stack.pop();
                }
                if (stack.empty()) {
                    return -1;
                }else {
                    y = stack.pop();
                }
                stack.push(y);
                stack.push(x);
                stack.push(x+y);
                res += x+y;
            }else if (ch == '-' && ops[i].length()>1){
                int value = Integer.parseInt(ops[i].substring(1));
                stack.push(-value);
                res -= value;
            }
            else {
                return -1;
            }
        }
        return res;
    }
}
