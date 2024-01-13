/*
 * @lc app=leetcode id=1347 lang=java
 *
 * [1347] Minimum Number of Steps to Make Two Strings Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> charMap1 = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            charMap1.put(c, 0);
        }

        HashMap<Character, Integer> charMap2 = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            charMap2.put(c, 0);
        }

        for (char ch1 : s.toCharArray()) {
            int oldFreq = charMap1.get(ch1);
            charMap1.put(ch1, oldFreq + 1);
        }

        for (char ch2 : t.toCharArray()) {
            int oldFreq = charMap2.get(ch2);
            charMap2.put(ch2, oldFreq + 1);
        }

        int count = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            count = count + Math.abs(charMap1.get(i) - charMap2.get(i));
        }

        return count / 2;
    }
}
// @lc code=end
