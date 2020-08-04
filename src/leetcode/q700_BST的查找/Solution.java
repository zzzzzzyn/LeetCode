package leetcode.q700_BST的查找;

public class Solution {

    // 递归
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) return searchBST(root.left, val);
        if (root.val < val) return searchBST(root.right, val);
        return null;
    }

    // 迭代
    public TreeNode searchBST2(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            }
        }
        return null;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}