/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public static int removeElement(int[] nums, int val) {
        // Initialize two pointers
        int i = 0;

        // Iterate through the array
        for (int j = 0; j < nums.length; j++) {
            // If the current element is not equal to val, move it to the front
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        // The first i elements now contain elements not equal to val
        return i;
    }
}
// @lc code=end
