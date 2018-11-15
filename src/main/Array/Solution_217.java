package main.Array;

import java.util.*;

/**
 * Created by wche on 2018/10/25
 * question: 判断数组是否有重复元素
 * solution: 用一个set/map，时间复杂度O（n),set比map快；暴力法两重循环超时了。
 * discussion: 先排序，时间复杂度O(nlogn),但是比哈希表快。。。
 */
public class Solution_217 {
    /**
     * HashTable
     * Time:O(n) Space:O(n)
     */
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> s = new HashSet<Integer>();  //final加快执行,想象C++的内联函数
        for (int e:nums) {
            if (s.contains(e)) return true;
            else s.add(e);
        }
        return false;
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for (int i=0;i<nums.length;i++) {
//            if (map.getOrDefault(nums[i], -1) != -1) return true;
//            else map.put(nums[i],1);
//        }
//        return false;
    }
    /**
     * 先排序
     * Time：O(nlogn) Space：O(1)
     */
    public boolean discussion1(int[] nums){
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;++i)
            if (nums[i] == nums[i+1])return true;
        return false;
    }


}
