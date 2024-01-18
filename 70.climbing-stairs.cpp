/*
 * @lc app=leetcode id=70 lang=cpp
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution
{
private:
    int ans[50];
public:
    int climbStairs(int n)
    {
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            ans[i] = ans[i-2] + ans[i-1];
        }
        return ans[n];
    }
};
// @lc code=end
