package main.String;

/**
 * Created by wche on 2018/10/26
 * question: 将一个句子所有单词的字母逆序存储，保留空格
 * solution: 先切割句子，再对单词操作，最后合并
 * discussion: StringBulider
 */
public class Solution_557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        s = "";
        for (int idx=0;idx<words.length;idx++){
            char[] chars = words[idx].toCharArray();
            for (int i=0;i<chars.length/2;i++){
                char tmp = chars[i];
                int end = chars.length-i-1;
                chars[i] = chars[end];
                chars[end] = tmp;
            }
            s += new String(chars)+" ";
        }
        return s.trim();
    }
    public String discuss(String s){
        String[] words = s.split(" ");
        for (int i=0;i<words.length;i++)
            words[i] = new StringBuffer(words[i]).reverse().toString();
        StringBuilder res = new StringBuilder();
        for (int i=0;i<words.length;i++)
            res.append(words[i]+" ");
        return res.toString().trim();
    }
}
