package 剑指offer.q25_合并两个排序的链表;

/**
 * Created by xyn on 2020/6/28
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode pMergeHead = null;
        if (l1.val < l2.val) {
            pMergeHead = l1;
            pMergeHead.next = mergeTwoLists(l1.next, l2);
        } else {
            pMergeHead = l2;
            pMergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return pMergeHead;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
