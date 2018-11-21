package main.HashTable;

/**
 * question:
 * solution:
 * discussion:
 */
public class Solution_922 {
    public int[] sortArrayByParityII(int[] A) {
        for (int i=0;i<A.length;){
            if (i % 2 == 0){
                int j = i+1;
                while (A[i] % 2 != 0 && j < A.length){
                    swap(A, i, j);
                    j++;
                }
            }else {
                int j = i+1;
                while (A[i] % 2 != 1 && j < A.length){
                    swap(A, i, j);
                    j++;
                }
            }
        }
        return A;
    }
    public void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
