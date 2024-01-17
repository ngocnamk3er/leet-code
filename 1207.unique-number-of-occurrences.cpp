/*
 * @lc app=leetcode id=1207 lang=cpp
 *
 * [1207] Unique Number of Occurrences
 */

// @lc code=start
#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;

class Solution
{
public:
    bool uniqueOccurrences(vector<int> &arr)
    {
        unordered_map<int, int> map1;
        unordered_map<int, bool> map2;
        for (int i = 0; i < arr.size(); i++)
        {
            map1[arr[i]]++;
        }

        for (auto it = map1.begin(); it != map1.end(); ++it)
        {
            if(map2[it->second] == true){
                return false;
            }else{
                map2[it->second] = true;
            }
        }
        return true;
    }
};
// @lc code=end
