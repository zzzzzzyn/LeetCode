package leetcode.q141_环形链表;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    // 双指针，快慢指针
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next.next;
        while (slow != null && fast != null) {
            if (slow == fast) return true;
            slow = slow.next;
            if (fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        // slow和fast没有相遇
        while (slow != fast) {
            // fast不为空且fast.next不为空(防止fast.next.next空指针异常)
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    // hash表记录
    public boolean hasCycle3(ListNode head) {
        if (head == null) return false;

        Map<ListNode, Object> map = new HashMap<>();
        while (head != null) {
            if (map.containsKey(head)) return true;
            map.put(head, 0);
            head = head.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
