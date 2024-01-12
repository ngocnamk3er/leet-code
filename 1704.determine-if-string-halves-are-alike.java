/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean halvesAreAlike(String s) {
        // Tạo HashSet để lưu trữ các ký tự
        HashSet<Character> charSet = new HashSet<>();

        // Thêm các ký tự vào HashSet
        charSet.add('a');
        charSet.add('e');
        charSet.add('i');
        charSet.add('o');
        charSet.add('u');
        charSet.add('A');
        charSet.add('E');
        charSet.add('I');
        charSet.add('O');
        charSet.add('U');

        boolean ans = true;
        int count1 = 0;
        int count2 = 0;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (charSet.contains(s.charAt(i))) {
                count1++;
            }
        }
        for (int i = length / 2; i < length; i++) {
            if (charSet.contains(s.charAt(i))) {
                count2++;
            }
        }
        if (count1 != count2) {
            ans = false;
        }
        return ans;
    }
}
// @lc code=end
