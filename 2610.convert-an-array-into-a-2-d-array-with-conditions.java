/*
 * @lc app=leetcode id=2610 lang=java
 *
 * [2610] Convert an Array Into a 2D Array With Conditions
 */

// @lc code=start
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> count = new ArrayList<>(nums.length + 1);
        for (int num : nums) {
            if (count.get(num) == ans.size()) {
                ans.add(new ArrayList<>());
            }
            count.set(num, count.get(num)+1);
            ans.get(count.get(num) - 1).add(num);
        }
        return ans;
    }
}
// @lc code=end
