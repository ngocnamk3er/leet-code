/*
 * @lc app=leetcode id=1026 lang=java
 *
 * [1026] Maximum Difference Between Node and Ancestor
 */

// @lc code=start

import java.math.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    public int min;
    public int max;
    public Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
    // public int min {
    //     return min;
    // }
    // public int max {
    //     return max;
    // }
}

class Solution {
    private final int MIN_INFINITY = -1000000;
    private int ans = MIN_INFINITY;

    public int maxAncestorDiff(TreeNode root) {
        Pair leftPair = minMaxValueInTree(root, root.left);
        Pair rightPair = minMaxValueInTree(root, root.right);
        int maxInDescendants = Math.max(leftPair.max, rightPair.max);
        int minInDescendants = Math.max(leftPair.min, rightPair.min);
        ans = Math.max(ans, Math.abs(root.val - minInDescendants));
        ans = Math.max(ans, Math.abs(root.val - maxInDescendants));
        return ans;
    }

    public Pair minMaxValueInTree(TreeNode root, TreeNode childNode) {
        int min;
        int max;
        int minInDescendants;
        int maxInDescendants;
        if (childNode == null) {
            return new Pair(root.val, root.val);
        } else {
            Pair leftPair = minMaxValueInTree(childNode, childNode.left);
            Pair rightPair = minMaxValueInTree(childNode, childNode.right);

            maxInDescendants = Math.max(leftPair.max, rightPair.max);
            minInDescendants = Math.min(leftPair.min, rightPair.min);

            ans = Math.max(ans, Math.abs(root.val - minInDescendants));
            ans = Math.max(ans, Math.abs(root.val - maxInDescendants));

            min = Math.min(minInDescendants, root.val);
            max = Math.max(maxInDescendants, root.val);
            return new Pair(min, max);

        }
    }
}
// @lc code=end
