package main.Array; /**
 * Created by wche on 2018/9/12.
 */

/**
 * 问题：给定一个二维数组，对这个数组做两种操作
 */
public class FlippingAnImage {
    private int[] reverse(int[] A){
        for (int i=0;i<A.length/2;i++){
            int temp = A[i];
            A[i] = A[A.length-i-1];
            A[A.length-i-1] = temp;
        }
        return A;
    }
    private int[] invert(int[] A){
        for(int i=0;i<A.length;i++)
            switch (A[i]){
                case 1:A[i]=0;break;
                case 0:A[i]=1;break;
            }
        return A;
    }
    public int[][] flipAndInvertImage(int[][] A) {
        if(A.length < 1 || A.length >20 || A[0].length <1 || A[0].length > 20)
            return A;
        for (int i = 0;i < A.length;i++){
            A[i] = invert(reverse(A[i]));
        }
        return A;
    }
}

class FlippingAnImageTest{
    public static void main(String[] args){
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        A = flippingAnImage.flipAndInvertImage(A);
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
}
