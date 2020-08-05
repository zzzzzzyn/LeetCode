package leetcode.q110_平衡二叉树;

public class Solution {

    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        maxDepth(root);
        return flag;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftLen = 0, rightlen = 0;
        if (root.left != null) {
            leftLen = maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            rightlen = maxDepth(root.right) + 1;
        }
        if (Math.abs(rightlen - leftLen) > 1) flag = false;
        return Math.max(leftLen, rightlen);
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

