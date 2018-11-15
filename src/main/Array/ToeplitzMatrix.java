package main.Array;

/**
 * 问题：特普利兹矩阵——左上角至右下角对角线上的元素都一样
 * 分析：TODO
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 1 || matrix[0].length == 1)
            return true;
        for (int i=matrix.length-2;i>=0;i--)
            for (int j=i+1,k=1;j<matrix.length/2;j++,k++)
                if (matrix[j][k] != matrix[i][0])
                    return false;
        for (int i=matrix[0].length-2;i>=0;i--)
            for (int j=i+1,k=1;j<matrix.length;j++,k++)
                if (matrix[k][j] != matrix[0][i])
                    return false;
        return true;
    }
}

class ToeplitzMatrixTest{
    public static void main(String[] args){
        int[][] matrix = new int[][]{{97,97},{80,97},{10,80}};
        System.out.println(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }
}
