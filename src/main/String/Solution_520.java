package main.String;

/**
 * Created by wche on 2018/10/26
 * question: 判断一个单词的大小写是否规范
 * solution: 分析各种情况
 * discussion: 统计大写字母的个数，规范的单词要么全是小写，要么全是大写，要么只有第一个是大写；正则表达式
 */
public class Solution_520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)return true;
        if ('a' <= word.charAt(0) && word.charAt(0) <= 'z'){ //all a~z
            for (int i=1;i<word.length();i++)
                if (word.charAt(i) < 'a' || word.charAt(i) > 'z')return false;
            return true;
        }else if ('A' <= word.charAt(0) && word.charAt(0) <= 'Z'){  // A
            if ('a' <= word.charAt(1) && word.charAt(1) <= 'z'){  //Azzz
                for (int i=2;i<word.length();i++)
                    if (word.charAt(i) < 'a' || word.charAt(i) > 'z')return false;
                return true;
            }else if ('A' <= word.charAt(1) && word.charAt(1) <= 'Z'){  //AAAA
                for (int i=2;i<word.length();i++)
                    if (word.charAt(i) < 'A' || word.charAt(i) > 'Z')return false;
                return true;
            }else return false;
        }else return false;
    }

    public boolean discuss(String word){
        int cnt = 0;
        for (char c:word.toCharArray())
            if ('Z' - c >= 0) cnt++;
        return (cnt == 0 || cnt == word.length() || (cnt == 1 && 'Z'-word.charAt(0) >= 0));
    }

    public boolean discuss1(String word){
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
