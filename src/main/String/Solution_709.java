package main.String;

/**
 * Created by wche on 2018/10/25
 * question:String转成小写
 * solution:String.toLowerCase，String->char[]
 * discussion:
 */
public class Solution_709 {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }
}
