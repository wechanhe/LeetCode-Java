package main.String;

/**
 * Created by wche on 2018/10/26
 * question: 计算二进制子串
 * solution:
 * discussion: Time--O(n)  Space--O(1)
 * 1.count the number of 1 or 0 grouped consecutively.
 * 2. for any possible substrings with 1 and 0 grouped consecutively, the number of valid substring will be the minimum number of 0 and 1
 */
public class Solution_696 {
    public int countBinarySubStrings(String s){
        int cur = 1, pre = 0, res = 0;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i-1))cur++;
            else {
                res += Math.min(cur,pre);
                pre = cur;   //pre记录频次
                cur = 1;
            }
        }
        return res + Math.min(cur,pre);
    }
}
