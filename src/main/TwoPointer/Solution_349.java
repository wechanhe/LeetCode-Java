package main.TwoPointer;

import java.util.*;
import java.util.stream.IntStream;

/**
 * question: 求两个数组的交集
 * solution: set 或者 利用额外的数组
 * discussion:
 */
public class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hasElement(nums2, nums1[i]))
                set.add(nums1[i]);
        }
        int[] res = new int[set.size()];
        int i = 0;
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            res[i++] = iter.next();
        }
        return res;
    }
    public boolean hasElement(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)return true;
        }
        return false;
    }
}
