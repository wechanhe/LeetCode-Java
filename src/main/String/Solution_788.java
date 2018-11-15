package main.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wche on 2018/10/26
 * question:rotate digits——(0,1,8)->不变也就是无效，(2,5)互换，(6,9)互换，剩余的变成无效。求有效
 * solution:
 * discussion:
 */
public class Solution_788 {
    final Set<Integer> validSet = new HashSet<>(), inValidSet = new HashSet<>();
    public boolean isValid(int value){
        boolean validFound = false;
        while (value > 0){
            if (validSet.contains(value % 10))
                validFound = true;
            else if (inValidSet.contains(value % 10))
                return false;
            value /= 10;
        }
        return validFound;
    }
    public int rotatedDigits(int N) {
        int count = 0;
        validSet.add(2);
        validSet.add(5);
        validSet.add(6);
        validSet.add(9);
        inValidSet.add(3);
        inValidSet.add(4);
        inValidSet.add(7);
        for (int i=1;i<=N;i++)
            if(isValid(i))
                count++;
        return count;
    }
}
