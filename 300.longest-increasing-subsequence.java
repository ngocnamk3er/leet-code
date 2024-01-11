/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxLength = 0;
        int[] lengthInIndexs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lengthInIndexs[j] + 1 > lengthInIndexs[i]) {
                    lengthInIndexs[i] = lengthInIndexs[j] + 1;
                }
            }
            maxLength = Math.max(maxLength, lengthInIndexs[i]);
        }
        return maxLength + 1;
    }
}
// @lc code=end
