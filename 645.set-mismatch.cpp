/*
 * @lc app=leetcode id=645 lang=cpp
 *
 * [645] Set Mismatch
 */

// @lc code=start

#include <vector>

using namespace std;

class Solution
{
public:
    vector<int> findErrorNums(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> v(n + 1, 0);
        int missing = 0, duplicate = 0;
        for (int i = 0; i < n; i++)
        {
            v[nums[i]]++;
        }
        for (int i = 1; i < v.size(); i++)
        {
            if (v[i] == 2)
                duplicate = i;
            if (v[i] == 0)
                missing = i;
        }
        return {duplicate, missing};
    }
};

// @lc code=end
