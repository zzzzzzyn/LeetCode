package leetcode.q98_验证二叉搜索树;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        if (!isBST(root.right, root.val, max)) return false;
        if (!isBST(root.left, min, root.val)) return false;

        return true;
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

