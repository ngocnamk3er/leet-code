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
        int minIndex = 999;
        string ans = "";
        int i;
        string minString;

        for (int i = 0; i < strs.size(); i++)
        {
            if (strs[i].size() < minIndex)
            {
                minIndex = strs[i].size();
                minString = strs[i];
            }
        }

        for (i = 0; i < minIndex; i++)
        {
            char c = minString[i];
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
