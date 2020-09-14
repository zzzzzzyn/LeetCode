package leetcode.q144_二叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        help(root, res);
        return res;
    }

    private void help(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        help(root.left, res);
        help(root.right, res);
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
