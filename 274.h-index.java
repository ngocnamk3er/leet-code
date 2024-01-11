/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        int hIndex = 0;

        // Step 2: Iterate through the sorted array
        for (int i = 0; i < n; ++i) {
            int papersWithAtLeastCitations = n - i;
            if (citations[i] >= papersWithAtLeastCitations) {
                hIndex = papersWithAtLeastCitations;
                break;
            }
        }

        return hIndex;
    }
}
// @lc code=end
