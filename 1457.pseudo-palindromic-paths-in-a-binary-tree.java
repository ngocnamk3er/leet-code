
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

import java.util.*;

class Solution {
    public int pseudoPalindromicPaths(TreeNode root) {
        return countPseudoPalindromicPaths(root, new HashSet<>());
    }

    private int countPseudoPalindromicPaths(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return 0;
        }

        // Toggle the value in the set
        if (!set.contains(node.val)) {
            set.add(node.val);
        } else {
            set.remove(node.val);
        }

        // If it's a leaf node, check if the path is pseudo-palindromic
        if (node.left == null && node.right == null) {
            // If the set size is at most 1, the path is pseudo-palindromic
            if (set.size() <= 1) {
                return 1;
            } else {
                return 0;
            }
        }

        // Recursively traverse left and right subtrees
        int count = countPseudoPalindromicPaths(node.left, new HashSet<>(set)) +
                countPseudoPalindromicPaths(node.right, new HashSet<>(set));

        return count;
    }
}