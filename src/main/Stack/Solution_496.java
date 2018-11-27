package main.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * question: 求nums1的数在nums2中第一个大的数
 * solution:
 * discussion:
 */
public class Solution_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0, k = 0; i < nums1.length; i++) {
            int idx = map.getOrDefault(nums1[i], -1);
            if (idx != -1){
                int j = idx;
                for (; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]){
                        list.add(nums2[j]);
                        break;
                    }
                }
                if (j == nums2.length)list.add(-1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
