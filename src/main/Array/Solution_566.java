package main.Array;

/**
 * 问题：实现MATLAB的reshape操作，保证按原数组的顺序写入目标数组
 * 解法：遍历一遍，把对应元素填入适当位置
 * discussion：用到了除法和取余操作，时间复杂度O(n*m)
 */
public class Solution_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c)
            return nums;
        int[][] ret = new int[r][c];
        int k = 0,l = 0;
        for (int i=0;i<nums.length;i++)
            for (int j=0;j<nums[i].length;j++)
                if (l < c) ret[k][l++] = nums[i][j];
                else {
                    k++;
                    l = 0;
                    ret[k][l++] = nums[i][j];
                }
        return ret;
    }
    public int[][] discuss(int[][] nums, int r, int c){
        int n = nums.length,m = nums[0].length;
        if (r*c != m*n)return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            res[i/c][i%c] = nums[i/m][i%m];
        return res;
    }
}
