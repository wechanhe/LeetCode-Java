package test.Array;

import main.Array.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test(timeout = 10)
    public void test_905(){
        Solution_905 s = new Solution_905();
        int[] A = {3,1,2,4},tmp;
//        tmp = s.sortArrayByParity(A);
        tmp = s.discuss(A);
        for(int i=0;i<tmp.length;i++)
            System.out.print(tmp[i]+" ");
    }
    @Test
    public void test_665(){
        Solution_665 s = new Solution_665();
        int[] nums = new int[]{4,2,3};
        System.out.println(s.checkPossibility(nums));
    }

    @Test
    public void test_556(){
        Solution_566 s = new Solution_566();
        int[][] nums = new int[][]{{1,2},{3,4}},ret;
        int r = 4,c = 1;
        ret = s.matrixReshape(nums,r,c);
        for (int i=0;i<ret.length;i++) {
            for (int j = 0; j < ret[i].length; j++)
                System.out.print(ret[i][j] + " ");
            System.out.println();
        }
    }

    @Test
    public void test_896(){
        Solution_896 s = new Solution_896();
        int[] A = {1,1,3};
        System.out.println(s.discuss(A));
    }

    @Test
    public void test_485(){
        Solution_485 s = new Solution_485();
        int[] A = {1,1,0,1,1,1};
        System.out.println(s.discuss(A));
    }

    @Test
    public void test_888(){
        Solution_888 s = new Solution_888();
        int[] A = {1,2,5},B = {2,4},res;
        res = s.findCandySwap(A,B);
        for (int e:res)
            System.out.print(e+" ");
    }

    @Test
    public void test_283(){
        Solution_283 s = new Solution_283();
        int[] nums = {0,0,1,1};
        s.moveZeroes(nums);
    }

    @Test
    public void test_448(){
        Solution_448 s = new Solution_448();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = new ArrayList<>();
        res = s.findDisappearedNumbers(nums);
        for (Integer i:res) {
            System.out.print(i+" ");
        }
    }

    @Test
    public void test_169(){
        Solution_169 s = new Solution_169();
        int[] A = {1,1,2,2,3};
        System.out.println(s.discuss(A));
    }

    @Test
    public void test_122(){
        Solution_122 s = new Solution_122();
        int[] A = {1,4,2};
        System.out.println(s.maxProfit(A));
    }

    @Test
    public void test_217(){
        Solution_217 s = new Solution_217();
        int[] A = new int[10001];
        for (int i=0;i<10000;i++)
            A[i] = i+1;
        A[10000] = 10000;
        System.out.println(s.containsDuplicate(A));
    }

    @Test
    public void test_717(){
        Solution_717 s = new Solution_717();
        int[] bits = {1,1,0};
        System.out.println(s.discuss(bits));
    }

    @Test
    public void test_167(){
        Solution_167 s = new Solution_167();
        int[] nums = {2,7,11,15};int target = 9;
        for(int e:s.twoSum(nums,target))
            System.out.print(e+" ");
    }

    @Test
    public void test_697(){
        Solution_697 s = new Solution_697();
        int[] nums = {1,2,2,3,1};
        System.out.println(s.findShortestSubArray(nums));
    }
}
