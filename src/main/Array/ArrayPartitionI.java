package main.Array;

import java.util.Arrays;
/**
 * 问题：给定2*n个数组成n对，将n对的较小值求和，使得该和最大
 * 分析：1、升序排序，倒数第二个与倒数第四个之和
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i+=2)
            sum += nums[i];
        return sum;
    }
}

class ArrayPartitionITest{
    public static void main(String[] args){
        int[] nums = {9,1,5,6,7,2};
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        System.out.println(arrayPartitionI.arrayPairSum(nums));
    }
}