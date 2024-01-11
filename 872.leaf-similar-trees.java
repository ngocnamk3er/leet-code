/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
 */

// @lc code=start

//  * Definition for a binary tree node.
import java.util.*;;

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

// */
class Solution {
    private List<Integer> leafNodes1 = new ArrayList<Integer>();
    private List<Integer> leafNodes2 = new ArrayList<Integer>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        inOrder(root1, leafNodes1);
        inOrder(root2, leafNodes2);
        return checkListSimilar(leafNodes1, leafNodes2);
    }

    private static void inOrder(TreeNode root, List<Integer> leafNodes) {
        if (root != null) {
            // Duyệt cây con bên trái
            inOrder(root.left, leafNodes);

            // Kiểm tra nút lá và thêm vào danh sách
            if (root.left == null && root.right == null) {
                leafNodes.add(root.val);
            }

            // Duyệt cây con bên phải
            inOrder(root.right, leafNodes);
        }
    }

    private boolean checkListSimilar(List<Integer> leafNodes1, List<Integer> leafNodes2) {
        if (leafNodes1.size() != leafNodes2.size()) {
            return false;
        }
        for (int i = 0; i < leafNodes1.size(); i++) {
            if(leafNodes1.get(i) != leafNodes2.get(i)) {
                return false;
            }
        }
        return true;
    }   
}
// @lc code=end
