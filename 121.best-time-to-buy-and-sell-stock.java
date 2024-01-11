/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int ptrLeft = 0;
        int ptrRight = 1;
        while (ptrRight < prices.length) {
            int diff = prices[ptrRight] - prices[ptrLeft];
            if (diff > 0) {
                maxProfit = Math.max(maxProfit, diff);
                ptrRight++;
            } else {
                ptrLeft = ptrRight;
                ptrRight++;
            }
        }
        return maxProfit;
    }
}
// @lc code=end
