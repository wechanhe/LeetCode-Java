package main.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wche on 2018/10/26
 * question:字符串分组，相等字符串（定义是i % 2 == j % 2 i,j位置交换两个字符串相等）分成一组
 * solution:
 * discussion: 定义一个set，为A的每个字符串生成签名
 */
public class Solution_893 {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String str : A){
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i=0;i< str.length();i++){
                if (i % 2 == 1)odd[str.charAt(i) - 'a']++;
                else even[str.charAt(i) - 'a']++;
            }
            String sig = Arrays.toString(odd) + Arrays.toString(even);
            set.add(sig);
        }
        return set.size();
    }
}
