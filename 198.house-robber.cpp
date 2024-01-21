/*
 * @lc app=leetcode id=198 lang=cpp
 *
 * [198] House Robber
 */

// @lc code=start

#include <vector>
#include <cmath>

using namespace std;

class Solution
{
public:
    int rob(vector<int> &nums)
    {
        if(nums.size() == 1){
            return nums[0];
        }
        int maxInIndexEnd[101] = {0};

        int ans = 0;

        maxInIndexEnd[0] = nums[0];
        maxInIndexEnd[1] = nums[1];

        for (int i = 2; i < nums.size(); i++)
        {
            maxInIndexEnd[i] = nums[i];
            for (int j = 0; j <= i - 2; j++)
            {
                maxInIndexEnd[i] = max(maxInIndexEnd[i], maxInIndexEnd[j] + nums[i]);
            }
        }

        for (int i = 0; i < nums.size(); i++)
        {
            if(maxInIndexEnd[i] > ans){
                ans = maxInIndexEnd[i];
            }
        }
        
        return ans;
    }
};
// @lc code=end
