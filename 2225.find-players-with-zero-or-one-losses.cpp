/*
 * @lc app=leetcode id=2225 lang=cpp
 *
 * [2225] Find Players With Zero or One Losses
 */

#include <vector>
#include <map>
#include <iostream>

using namespace std;

// @lc code=start
class Solution
{
private:
    map<int, int> countWinners;
    map<int, int> countLosers;
    vector<vector<int>> count = {{}, {}};

public:
    vector<vector<int>> findWinners(vector<vector<int>> &matches)
    {
        for (int i = 0; i < matches.size(); i++)
        {
            countLosers[matches[i][1]]++;
            countWinners[matches[i][0]]++;
            if (countWinners[matches[i][0]] != 0 && countLosers[matches[i][0]] == 0)
            {
                countLosers[matches[i][0]] = 0;
            }
        }

        for (const auto &pair : countLosers)
        {
            if (pair.second == 1)
            {
                count[1].push_back(pair.first);
            }
            else if (pair.second == 0)
            {
                count[0].push_back(pair.first);
            }
        }
        return count;
    }
};
// @lc code=end
