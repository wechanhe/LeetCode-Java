package main.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wche on 2018/10/28
 * question:
 * solution:
 * discussion:
 */
public class Solution_771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int nums = 0;
        for (int i=0;i<J.length();i++)
            set.add(J.charAt(i));
        for (int i=0;i<S.length();i++)
            if (set.contains(S.charAt(i)))
                nums++;
        return nums;
    }
}
