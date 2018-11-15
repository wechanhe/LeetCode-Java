package main.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/26
 * question:A 能否由 B 构造而来
 * solution: 可以定义两个哈希表记录A,B的元素
 * discussion: 用一个数组来记录二者个数的关系
 */
public class Solution_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<Character,Integer>(), map2 = new HashMap<Character,Integer>();
        for (int i=0;i<ransomNote.length();i++)
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0) + 1);
        for (int j=0;j<magazine.length();j++)
            map2.put(magazine.charAt(j),map2.getOrDefault(magazine.charAt(j),0) + 1);
        for (Character key1 : map1.keySet())
            if (map1.get(key1) > map2.getOrDefault(key1,0))return false;
        return true;
    }
    public boolean discuss(String ransomNote, String magazine){
        int[] arr = new int[26];
        for (int i=0;i<magazine.length();i++)
            arr[magazine.charAt(i) - 'a']++;
        for (int j=0;j<ransomNote.length();j++)
            if (--arr[ransomNote.charAt(j) - 'a'] < 0)return false;
        return true;
    }
}
