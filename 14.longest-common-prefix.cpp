/*
 * @lc app=leetcode id=14 lang=cpp
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
#include <string>
#include <vector>

using namespace std;

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        int maxIndex = 202;
        string ans = "";
        int i;
        for (i = 0; i < maxIndex; i++)
        {
            if (i >= strs[0].size())
            {
                break;
            }
            char c = strs[0][i];
            int check = true;
            for (int j = 0; j < strs.size(); j++)
            {
                if (strs[j][i] != c)
                {
                    check = false;
                    break;
                }
            }
            if (check == true)
            {
                ans = ans + c;
            }
            else
            {
                break;
            }
        }

        return ans;
    }
};
// @lc code=end
