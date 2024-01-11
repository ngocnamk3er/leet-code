/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        int pointer = 1;
        int current_value = nums[0];
        int frequent_current_value = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current_value) {
                frequent_current_value++;
                if (frequent_current_value <= 2) {
                    nums[pointer] = current_value;
                    count++;
                    pointer++;
                }
            } else {
                current_value = nums[i];
                frequent_current_value = 1;
                
                nums[pointer] = current_value;
                count++;
                pointer++;
            }
        }

        return count;
    }
}
// @lc code=end
