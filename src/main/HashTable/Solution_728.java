package main.HashTable;

import java.util.ArrayList;
import java.util.List;

/**
 * question: 判断自除数——能被其每一位数整除
 * solution:
 * discussion:
 */
public class Solution_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i=left;i<=right;i++){
            if (isSelfDividingNumbers(i))
                res.add(i);
        }
        return res;
    }
    public boolean isSelfDividingNumbers(int num){
        boolean check = true;
        int n = num;
        while (num != 0){
            int digit = num % 10;
            if (digit == 0){
                check = false;
                break;
            }
            if (n % digit != 0){
                check = false;
                break;
            }
            num /= 10;
        }
        return check;
    }
}
