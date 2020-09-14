package leetcode.q101_对称二叉树;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricCore(root.left, root.right);
    }

    public boolean isSymmetricCore(TreeNode rootA, TreeNode rootB) {
        if (rootA == null) return rootB == null;
        if (rootB == null) return rootA == null;
        if (rootA.val != rootB.val) return false;
        return isSymmetricCore(rootA.left, rootB.right) && isSymmetricCore(rootA.right, rootB.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
