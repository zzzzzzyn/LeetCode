package 剑指offer.q28_对称的二叉树;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricCore(root.left, root.right);
    }

    private boolean isSymmetricCore(TreeNode rootA, TreeNode rootB) {
        if (rootA == null) return rootB == null;
        if (rootB == null) return rootA == null;

        if (rootA.val != rootB.val) return false;
        return isSymmetricCore(rootA.left, rootB.right) && isSymmetricCore(rootA.right, rootB.left);
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
