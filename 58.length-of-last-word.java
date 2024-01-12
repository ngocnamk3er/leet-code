/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
    
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count++;
            } else if (ch == ' ' && count != 0) {
                return count;
            }
        }
        return count;
    }
}
// @lc code=end
