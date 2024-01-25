/*
 * @lc app=leetcode id=1143 lang=cpp
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start
class Solution {
public:
    int longestCommonSubsequence(string &a, string &b) {
        short m[1001][1001] = {};
        for (auto i = 0; i < a.size(); ++i)
            for (auto j = 0; j < b.size(); ++j)
                m[i + 1][j + 1] = a[i] == b[j] ? m[i][j] + 1 : max(m[i + 1][j], m[i][j + 1]);
        return m[a.size()][b.size()];
    }
};
// @lc code=end

