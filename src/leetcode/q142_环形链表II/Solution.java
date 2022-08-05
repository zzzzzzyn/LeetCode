package leetcode.q142_环形链表II;

import java.util.HashSet;

/**
 * @author: xuyanan
 * @date: 2022/8/5
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.add(head)) {
                head = head.next;
            } else {
                return head;
            }
        }

        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
