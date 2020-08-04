package leetcode.q104_二叉树的最大深度;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root==null)return 0;

        return max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    private int max(int a,int b){
        return Math.max(a,b);
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

