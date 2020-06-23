package 剑指offer.q7_重建二叉树;

import java.util.HashMap;

/**
 * Created by xyn on 2020/6/23
 */
public class Solution {

    // preorder: [3,9,20,15,7]
    // inorder:  [9,3,15,20,7]
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int length = preorder.length;
        HashMap<Integer, Integer> map = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTree(0, length - 1, 0, length - 1, preorder, inorder, map);
    }

    public TreeNode buildTree(int startPreorder, int endPreorder, int startInorder, int endInorder, int[] preorder, int[] inorder, HashMap<Integer, Integer> map) {
        if (startPreorder > endPreorder) return null;

        int headVal = preorder[startPreorder];
        TreeNode head = new TreeNode(headVal);
        if (startPreorder == endPreorder) return head;

        Integer headIndex = map.get(headVal);
        int leftNodes = headIndex - startInorder;
        int rightNodes = endInorder - headIndex;

        TreeNode leftSubTree = buildTree(startPreorder + 1, startPreorder + leftNodes, startInorder, headIndex - 1, preorder, inorder, map);
        TreeNode rightSubTree = buildTree(endPreorder - rightNodes + 1, endPreorder, headIndex + 1, endInorder, preorder, inorder, map);
        head.left = leftSubTree;
        head.right = rightSubTree;
        return head;
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
