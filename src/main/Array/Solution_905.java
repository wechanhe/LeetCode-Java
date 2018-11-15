package main.Array;

/**
 * 给定一个非负整数数组A，对该数组做奇偶排序，偶数在奇数前面
 * 思路：使用额外空间，遍历数组一遍，偶数放前面，奇数放后面
 * discussion: in-place swap -
 */
public class Solution_905 {
    public int[] sortArrayByParity(int[] A) {
        int[] ret = new int[A.length];
        for (int begin=0,end=A.length-1,idx=0;idx<A.length;idx++){
            if (A[idx] % 2 == 0)
                ret[begin++] = A[idx];
            else ret[end--] = A[idx];
        }
        return ret;
    }
    public int[] discuss(int[] A){
        for (int i = 0, j = 0;j<A.length;j++)
            if (A[j] % 2 == 0){
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;
            }
        return A;
    }
}
