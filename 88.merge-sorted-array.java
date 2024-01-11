/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int iNums1 = 0;
        int iNums2 = 0;
        int ans[] = new int[m + n];
        int iAns = 0;
        while (iNums1 < m && iNums2 < n) {
            if (nums1[iNums1] < nums2[iNums2]) {
                ans[iAns] = nums1[iNums1];
                iAns++;
                iNums1++;
            } else {
                ans[iAns] = nums2[iNums2];
                iAns++;
                iNums2++;
            }
        }
        while (iNums1 < m) {
            ans[iAns] = nums1[iNums1];
            iAns++;
            iNums1++;
        }
        while (iNums2 < n) {
            ans[iAns] = nums2[iNums2];
            iAns++;
            iNums2++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}
// @lc code=end
