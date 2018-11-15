package main.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/25
 * question: 查找出现频次大于n/2的数（其实是找出现次数最多的数？）
 * solution: 使用Map，key记录元素，value记录频次-时间复杂度高；
 * discussion:
 */
public class Solution_169 {
    public int majorityElement(int[] nums) {
        int max = 0,maxKey = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(int k:map.keySet()) {
            int value = map.get(k);
            if (value > max) {
                maxKey = k;
                max = value;
            }
        }
        return maxKey;
    }
    public int discuss(int[] nums){
        int major = nums[0], count = 1;
        for (int i=1;i<nums.length;i++){
            if (count==0){
                count++;
                major=nums[i];
            }else if (major==nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return major;
    }
}
