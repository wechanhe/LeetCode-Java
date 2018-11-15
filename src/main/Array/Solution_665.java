package main.Array;

/**
 * 给定一个数组，判断是否可以在最多修改一个元素的情况下修改数组为非递减数组
 * discussion: greedy
 */
public class Solution_665 {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i=1;i<nums.length && cnt <= 1;i++){
            if (nums[i-1] > nums[i]){
                cnt++;
                if (i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];
                else nums[i] = nums[i-1];
            }
        }
        return cnt<=1;
    }
}
