package main.Array;

/**
 * 问题：给定一个数组nums，求两个元素之和等于target的元素，输出下标
 * 分析：1、暴力法：两重循环
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean tag = false;
        for(int i=0;i<nums.length-1 && !tag;i++)
            for (int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    tag = true;
                }
        return result;
    }
}

class TwoSumTest{
    public static void main(String[] args){
        int[] nums ={2,7,11,15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums,9);
        for (int index:result) {
            System.out.print(index+" ");
        }
    }
}