package main.Array;

/**
 * 问题：矩阵的转置
 * 分析：a[j][i] = a[i][j]，注意矩阵不是方阵的情况
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int i=0;i < A.length;i++)
            for (int j=0;j < A[i].length;j++)
                B[j][i] = A[i][j];
        return B;
    }
}

class TransposeMatrixTest{
    private static void printMatrix(int[][] A){
        for (int[] a:A) {
            for (int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] A = {{1,1,1},{2,2,2}};
        printMatrix(A);
        System.out.println();
        printMatrix(new TransposeMatrix().transpose(A));
    }
}
