package leetcode.q24_两两交换链表中的节点;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        return swap(head);
    }

    private ListNode swap(ListNode prev) {
        if (prev == null || prev.next == null) return prev;

        ListNode next = prev.next;

        ListNode listNode = swap(next.next);

        ListNode tmp = prev;
        prev = next;
        next = tmp;

        prev.next = next;
        next.next = listNode;

        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}