package leetcode.q814_二叉树剪枝;

public class Solution {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        remove(root);
        return root;
    }

    private boolean remove(TreeNode node) {
        if (node.left != null && remove(node.left)) node.left = null;
        if (node.right != null && remove(node.right)) node.right = null;
        if (node.val == 0 && node.left == null && node.right == null) return true;
        return false;
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

