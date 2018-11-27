package main.TwoPointer;

/**
 * question: 字符串逆序
 * solution:
 * discussion:
 */
public class Solution_344 {
    public String reverseString(String s) {
        int i = 0, j = s.length()-1;
        char[] chars = s.toCharArray();
        while (i < s.length()/2){
            char tmp = chars[i];
            chars[i] = chars[s.length()-i-1];
            chars[s.length()-i-1] = tmp;
            i++;
        }
        return new String(chars);
    }
}
