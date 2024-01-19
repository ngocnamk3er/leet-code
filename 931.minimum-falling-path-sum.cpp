/*
 * @lc app=leetcode id=931 lang=cpp
 *
 * [931] Minimum Falling Path Sum
 */

// @lc code=start
#include <vector>
#include <algorithm>

class Solution
{
public:
    int minFallingPathSum(std::vector<std::vector<int>> &matrix)
    {
        int n = matrix.size();

        // Handle the base case when the matrix is empty
        if (n == 0)
        {
            return 0;
        }

        // Iterate from the second row to the last row
        for (int i = 1; i < n; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                // Calculate the minimum falling path sum for the current element
                matrix[i][j] += std::min({(j > 0) ? matrix[i - 1][j - 1] : INT_MAX,
                                          matrix[i - 1][j],
                                          (j < n - 1) ? matrix[i - 1][j + 1] : INT_MAX});
            }
        }

        // Find the minimum falling path sum in the last row
        return *std::min_element(matrix[n - 1].begin(), matrix[n - 1].end());
    }
};

// @lc code=end
