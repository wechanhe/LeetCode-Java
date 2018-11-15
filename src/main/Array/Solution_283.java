package main.Array;

/**
 * Created by wche on 2018/10/25
 * question:将一个数组的所有0移动到数组后，保持非0元素的原来相对次序,要求in-place swap
 * solution:注意到，在LeetCode编译器下j++写在数组下标会提高一倍的执行效率，但是在IDEA本地好像变慢了
 * discussion:
 */
public class Solution_283 {
    public void moveZeroes(int[] nums) {
        for (int i=0,j=0;i<nums.length;i++)
            if (nums[i] != 0){
                int tmp = nums[j];
                nums[j++] = nums[i];
                nums[i] = tmp;
            }
        for (int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}
