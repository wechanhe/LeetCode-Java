package main.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/27
 * question: 判断一个字符串是否包含多个A，L，P
 * solution:
 * discussion:
 */
public class Solution_551 {
    public boolean checkRecord(String s) {
        int countA = 0;
        if (s.length() < 2)return true;
        if (s.length() == 2){
            if (s.charAt(0) == 'A' && s.charAt(1) == 'A')return false;
            else return true;
        }
        for (int i=1;i<s.length()-1;i++){
            if (s.charAt(i-1) == 'L' && s.charAt(i) == 'L' && s.charAt(i+1) == 'L')return false;
            if (s.charAt(i) == 'A')countA++;
        }
        if (s.charAt(0) == 'A')countA++;
        if (s.charAt(s.length()-1) == 'A')countA++;
        return countA>1?false:true;
    }
    public boolean discuss(String s){
        if (s.indexOf('A') != s.lastIndexOf('A') || s.contains("LLL"))return false;
        return true;
    }
}
