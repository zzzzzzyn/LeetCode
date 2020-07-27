package leetcode.q21_合并两个有序链表;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode pMergeHead;
        if (l1.val > l2.val) {
            pMergeHead = l2;
            pMergeHead.next = mergeTwoLists(l1, l2.next);
        } else {
            pMergeHead = l1;
            pMergeHead.next = mergeTwoLists(l1.next, l2);
        }
        return pMergeHead;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
