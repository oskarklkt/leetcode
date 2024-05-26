package main.java.com.oklekot.leetcode.Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right;
            } else {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            right++;
        }
        return maxProfit;
    }
}
