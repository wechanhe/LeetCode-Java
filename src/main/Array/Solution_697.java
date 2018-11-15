package main.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wche on 2018/10/25
 * question:最频繁数出现的次数为数组的度，求度相同的最短子串的长度
 * solution:
 * discussion: Map<Integer,int[]>,记录每个元素的degree，beginIdx，endIdx;
 */
public class Solution_697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums == null)return 0;
        Map<Integer,int[]> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i]))
                map.put(nums[i],new int[]{1, i, i});
            else {
                int[] tmp = map.get(nums[i]);
                tmp[0]++;
                tmp[2] = i;
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for(int[] e:map.values()){
            if (e[0] > degree){
                degree = e[0];
                res = e[2] - e[1] + 1;
            }else if (e[0] == degree){
                int tmp = e[2] - e[1] + 1;
                res = tmp<res?tmp:res;
            }
        }
        return res;
    }
}
