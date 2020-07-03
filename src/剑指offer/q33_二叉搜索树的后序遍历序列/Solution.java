package 剑指offer.q33_二叉搜索树的后序遍历序列;

public class Solution {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0 || postorder.length == 1) return true;

        return verifyCore(0, postorder.length - 1, postorder);
    }

    private boolean verifyCore(int start, int end, int[] postorder) {
        if (start >= end) return true;

        int p = start;
        while (postorder[p] < postorder[end]) p++;
        int m = p;
        while (postorder[p] > postorder[end]) p++;
        return p == end && verifyCore(start, m - 1, postorder) &&
                verifyCore(m, end - 1, postorder);
    }

    public static void main(String[] args) {
        boolean flag = new Solution().verifyPostorder(new int[]{7, 4, 6, 5});
        System.out.println(flag);
    }

}
