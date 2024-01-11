/*
 * @lc app=leetcode id=2125 lang=java
 *
 * [2125] Number of Laser Beams in a Bank
 */

// @lc code=start
import java.util.ArrayList;

class Solution {
    public int numberOfBeams(String[] bank) {
        int preCount = 0;
        int currentCount = 0;
        int ans = 0;
        for (int i = 0; i < bank.length; i++) {
            int numberOfSercurityServices = countSecurityDevice(bank[i]);
            if (numberOfSercurityServices > 0) {
                preCount = currentCount;
                currentCount = numberOfSercurityServices;
                ans = ans + preCount * currentCount;
            }
        }
        return ans;
    }

    private int countSecurityDevice(String row) {
        int numberOfDevices = 0;
        for (int i = 0; i < row.length(); i++) {
            numberOfDevices += row.charAt(i) - '0';
        }
        return numberOfDevices;
    }
}
// @lc code=end
