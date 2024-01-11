/*
 * @lc app=leetcode id=455 lang=cpp
 *
 * [455] Assign Cookies
 */

// @lc code=start

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        // Sắp xếp các mảng
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        int count = 0;
        int i = 0;

        // Duyệt qua các đứa trẻ và bánh quy
        for (int greed : g) {
            while (i < s.size() && s[i] < greed) {
                i++;
            }
            if (i < s.size()) {
                count++;
                i++;
            }
        }

        return count;
    }
};

// @lc code=end
