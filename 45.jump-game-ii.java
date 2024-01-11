/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        if (nums.length<=1) {
            return 0;
        }
        int ladder = nums[0];
        int stairs = nums[0];
        int jump = 1;
        for (int level = 1; level < nums.length; level++) {
            if(level == nums.length - 1){
                return jump;
            }

            if (level + nums[level] > ladder) {
                ladder = level + nums[level];
            }
            stairs--;
            if(stairs == 0) {
                jump++;
                stairs = ladder - level;
            }
            
        }
        return jump;
    }
}
// @lc code=end

