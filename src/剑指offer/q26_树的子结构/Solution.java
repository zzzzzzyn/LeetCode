package 剑指offer.q26_树的子结构;

/**
 * Created by xyn on 2020/6/28
 */
public class Solution {

    // 分两步，先找到相同的首节点，然后判断结构
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean res = false;

        if (A != null && B != null) {
            if (A.val == B.val) {
                // 子结构判断
                res = doesTreeHaveTree(A, B);
            }
            if (!res) res = isSubStructure(A.left, B);
            if (!res) res = isSubStructure(A.right, B);
        }
        return res;
    }

    private boolean doesTreeHaveTree(TreeNode rootA, TreeNode rootB) {
        if (rootA == null) return rootB == null;
        if (rootB == null) return true;

        if (rootA.val == rootB.val) {
            return doesTreeHaveTree(rootA.left, rootB.left) && doesTreeHaveTree(rootA.right, rootB.right);
        }
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
