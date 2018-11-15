package main.Array;

/**
 * Created by wche on 2018/10/25
 * question: 求最大利润
 * solution: if a[i] < a[i+1] do buy;if a[i] > a[i+1] do sold。注意边界条件的设定
 * discussion: c-b + b-a = c-a
 */
public class Solution_122 {
    public int maxProfit(int[] prices) {
        int max = 0,buy = -1;
        for (int i=0;i<prices.length-1;i++)
            if (prices[i] < prices[i+1] && buy == -1)
                buy = i;
            else if (prices[i] > prices[i+1] && buy >= 0){
                max += prices[i] - prices[buy];
                buy = -1;
            }
        return (buy == -1)?max:max+prices[prices.length-1]-prices[buy];
    }
    public int discuss(int[] prices){
        int total = 0;
        for (int i=0;i<prices.length-1;i++)
            if (prices[i+1]>prices[i])total += prices[i+1]-prices[i];
        return total;
    }
}
