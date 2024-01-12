/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 */

// @lc code=start


class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);
        for (char ch : firstHalf.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count1++;
            }
        }
        for (char ch : secondHalf.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count2++;
            }
        }
 
        return count1 == count2;
    }
}
// @lc code=end
