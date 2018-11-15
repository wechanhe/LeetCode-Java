package main.Array;

/**
 * Created by wche on 2018/10/24
 * question: 单调数组
 * solution: 先判断递增递减，再两两比对。代码不整洁
 * discussion: 布尔变量 &操作
 */
public class Solution_896 {
    public boolean isMonotonic(int[] A) {
        if (A.length == 1)
            return true;
        if(A[0] < A[A.length-1]){    //递增
            for (int i=1;i<A.length;i++)
                if (A[i] < A[i-1])
                    return false;
        }else{      //递减
            for (int i=1;i<A.length;i++)
                if (A[i] > A[i-1])
                    return false;
        }
        return true;
    }

    public boolean discuss(int[] A){
        boolean inc = true, dec = true;
        for (int i=1;i<A.length;i++){
            inc &= A[i-1] <= A[i];
            dec &= A[i-1] >= A[i];
        }
        return inc || dec;
    }
}
