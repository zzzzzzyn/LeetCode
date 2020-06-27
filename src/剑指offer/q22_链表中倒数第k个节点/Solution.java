package 剑指offer.q22_链表中倒数第k个节点;

import java.util.HashMap;

/**
 * Created by xyn on 2020/6/27
 */
public class Solution {

    // 存入map来取
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) return null;

        HashMap<Integer, ListNode> map = new HashMap<>();
        int count = 1;
        while (head != null) {
            map.put(count, head);
            head = head.next;
            count++;
        }

        return map.get(count - k);
    }

    // 双指针(快慢指针，间隔为k)
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;

        for (int i = 0; i < k; i++) {
            former = former.next;
        }

        while (former != null) {
            former = former.next;
            latter = latter.next;
        }

        return latter;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
