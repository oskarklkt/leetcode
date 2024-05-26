# 121. Best time to buy and sell stock

## Description
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


Example 2:

Input: prices = [7,6,4,3,1]

Output: 0

Explanation: In this case, no transactions are done and the max profit = 0.



## Logic

```java
public class Solution {
    public int maxProfit(int[] prices) {
        // we create two pointers left - buy, right - sell and maxProfit variable
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            // if sell price is lower than buy price we move buy to sell and move sell one cell right
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
```

## Results

- Runtime: 2ms
- Memory usage: 61 MB
- Time complexity: O(n)

note that both of those parameters may differ a bit in every run.
