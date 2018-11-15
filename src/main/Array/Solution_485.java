package main.Array;

/**
 * Created by wche on 2018/10/24
 * question:求最大连续出现1的次数
 * solution: 遍历一遍，时间复杂度O（n）,时间5ms
 * discussion:简洁代码，但时间复杂度有点高，大概9ms
 */
public class Solution_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for (int i=0;i<nums.length;i++)
            if (nums[i] == 1){
                count++;
            }else {
                max = count > max?count:max;
                count = 0;
            }
        return max = count > max?count:max;
    }
    public int discuss(int[] nums){
        int maxHere = 0,max = 0;
        for (int n:nums) {
            max = Math.max(max,maxHere = n == 0?0:maxHere+1);
        }
        return max;
    }
}
