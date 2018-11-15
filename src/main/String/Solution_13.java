package main.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/26
 * question: 罗马数字
 * solution:
 * discussion:
 */
public class Solution_13 {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = map.get(ch);
            res += val;
            switch (ch){
                case 'I':{
                    if (i+1 < s.length()) {
                        if (s.charAt(i + 1) == 'V') {
                            res += 4 - val;++i;
                        } else if (s.charAt(i + 1) == 'X') {
                            res += 9 - val;++i;
                        }
                    }
                    break;
                }
                case 'X':{
                    if (i+1 < s.length()) {
                        if (s.charAt(i + 1) == 'L') {
                            res += 40 - val;++i;
                        }
                        else if (s.charAt(i + 1) == 'C') {
                            res += 90 - val;++i;
                        }
                    }
                    break;
                }
                case 'C':{
                    if (i+1 < s.length()){
                        if (s.charAt(i+1) == 'D'){
                            res += 400 - val;++i;
                        }
                        else if (s.charAt(i+1) == 'M'){
                            res += 900 - val;++i;
                        }
                    }
                    break;
                }
                default:break;
            }
        }
        return res;
    }
}
