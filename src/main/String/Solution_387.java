package main.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/26
 * question: 寻找第一个无重复元素
 * solution: 定义一个Map<Character,int[]>,数组部分记录下标及次数.Time:O(N) Space:O(M)
 * discussion: 用一个数组记录出现次数
 */
public class Solution_387 {
    public int firstUniqChar(String s) {
        Map<Character,int[]> map = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){
            int[] tmp = map.get(s.charAt(i));
            if(tmp != null){
                tmp[1]++;
            }else {
                tmp = new int[2];
                tmp[0] = i;
                tmp[1] = 1;
                map.put(s.charAt(i),tmp);
            }
        }
        for (Character c : map.keySet()){
            int[] tmp = map.get(c);
            if (tmp[1] == 1){
                return tmp[0];
            }
        }
        return -1;
    }

    public int discuss(String s){
        int[] freq = new int[26];
        for (int i=0;i<s.length();i++)
            freq[s.charAt(i) - 'a']++;
        for (int i=0;i<s.length();i++)
            if (freq[s.charAt(i) - 'a'] == 1)return i;
        return -1;
    }
}
