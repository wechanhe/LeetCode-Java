package main.String;

/**
 * Created by wche on 2018/10/26
 * question:字符串翻转
 * solution:
 * discussion:
 */
public class Solution_344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length/2;i++){
            char ch = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = ch;
        }
        return new String(chars);
    }
}
