/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int size = s.length();
        int count = 0;
        boolean dp[][] = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            dp[i][i] = true;
            count++;
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; j + i < size; j++) {
                if (s.charAt(j) == s.charAt(j + i) && (dp[j + 1][j + i - 1] == true || i == 1)) {
                    count++;
                    dp[j][j+i] = true;
                }
            }
        }
        return count;
    }
}
// @lc code=end
