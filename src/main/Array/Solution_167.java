package main.Array;

/**
 * Created by wche on 2018/10/25
 * question:给定顺序递增数组A，求两个元素之和等于target的元素下标
 * solution:双指针
 * discussion:
 */
public class Solution_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j) {
            if (numbers[i] + numbers[j] == target) break;
            else if (numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return new int[]{i+1,j+1};
    }
}
