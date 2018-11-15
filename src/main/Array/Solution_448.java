package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wche on 2018/10/25
 * question：查找没有出现在一个数组A的元素，元素数值范围是1-A.length，要求时间复杂度O(n)，空间复杂度O(1)
 * solution: 用集合的差集,超时了; 用一个额外数组记录那些元素出现了，运行通过；
 * discussion: 将出现过的元素用负数来标记，也是遍历两遍:nums[nums[i] -1] = -nums[nums[i]-1]
 */
public class Solution_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] tmp = new int[nums.length+1];
        for (int i=0;i<nums.length;i++)
            tmp[nums[i]] = 1;
        for (int i=1;i<tmp.length;i++)
            if (tmp[i] == 0)
                res.add(new Integer(i));
        return res;
    }

    public List<Integer> discuss(int[] nums){
        List<Integer> ret = new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        for (int i=0;i<nums.length;i++)
            if (nums[i] > 0)
                ret.add(i+1);
        return ret;
    }

    /**
     * 集合差集
     * @param nums
     * @return
     */
    public List<Integer> solution1(int[] nums){
        List<Integer> res = new ArrayList<>(),tmp = new ArrayList<>();
        for (int i= 0;i<nums.length;i++){
            res.add(i+1);
            if (!tmp.contains(nums[i]))tmp.add(nums[i]);
        }
        return res.stream().filter(t -> !tmp.contains(t)).collect(Collectors.toList());
    }

    public List<Integer> solution2(int[] nums){
        List<Integer> res = new ArrayList<>();
        for (int i= 0;i<nums.length;i++)
            res.add(i+1);
        for(int i:nums)
            if (res.contains(i))
                res.remove(new Integer(i));
        return res;
    }
}
