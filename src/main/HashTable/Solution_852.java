package main.HashTable;

/**
 * question:
 * solution:
 * discussion:
 */
public class Solution_852 {
    public int peakIndexInMountainArray(int[] A) {
        if (A.length < 3)
            return -1;
        int flag = -1, index = -1;
        for (int i=1;i<A.length;i++){
            switch (flag){
                case -1:{
                    if (A[i-1] <= A[i])continue;
                    else {
                        flag = 1;
                        index = i-1;
                    }
                    break;
                }
                case 1:{
                    if (A[i-1] >= A[i])continue;
                    else {
                        return -1;
                    }
                }
            }
        }
        return index;
    }
}
