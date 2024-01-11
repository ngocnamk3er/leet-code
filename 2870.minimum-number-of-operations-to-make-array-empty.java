/*
 * @lc app=leetcode id=2870 lang=java
 *
 * [2870] Minimum Number of Operations to Make Array Empty
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int t = entry.getValue();
            if (t == 1)
                return -1;
            ans += t / 3;
            if (t % 3 != 0)
                ans++;
        }
        return ans;
    }
}
// @lc code=end
