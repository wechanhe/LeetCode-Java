package main.HashTable;

/**
 * question: 汉明距离——两个整数写成二进制的形式，他们不同位数的个数
 * solution: 按照十进制转二进制的方法，计算不同位的个数，循环条件要注意
 * discussion:
 */
public class Solution_461 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0){
            int bitX = x % 2, bitY = y % 2;
            if (bitX != bitY)
                count++;
            x /= 2;
            y /= 2;
        }
        return count;
    }
}
