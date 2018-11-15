package main.Array;

import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Created by wche on 2018/10/25
 * question:A 和 B两个数组，交换一个元素使得A，B元素之和相等（A,B可能顺序递增）
 * solution:
 * discussion:Calculate dif = (sum(A) - sum(B)) / 2,We want find a pair (a, b) with a = b + dif。注意数据结构的灵活应用：Array，List，Map，Set
 */
public class Solution_888 {
    public int[] findCandySwap(int[] A,int[] B){
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum())/2;
        HashSet<Integer> S = new HashSet<>();
        for (int a:A)S.add(a);
        for (int b:B)if (S.contains(b+dif))return new int[]{b+dif,b};
        return new int[0];
    }
}
