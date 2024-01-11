/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int ramain_jump = 1;
        for (int i = 0; i < nums.length; i++) {
            ramain_jump--;
            if(ramain_jump == -1){
                return false;
            }else{
                ramain_jump = Math.max(ramain_jump, nums[i]);
            }
        }
        return true;
    }
}
// @lc code=end
