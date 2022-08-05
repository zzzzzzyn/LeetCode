package 模拟测试;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static int[] findDiagonalOrder(int[][] mat) {
        int mLen = mat.length;
        int nLen = mat[0].length;

        // 1为上方向, 2为下方向
        boolean top = true;

        int[] res = new int[mLen * nLen];

        int index = 0;
        int m = 0;
        int n = 0;
        while (index < res.length) {
            res[index++] = mat[m][n];

            if (top) {
                if (m - 1 < 0) {
                    top = false;
                } else {
                    m--;
                }

                if (n + 1 >= nLen) {
                    m++;
                } else {
                    n++;
                }
            } else {
                if (n - 1 < 0) {
                    top = true;
                } else {
                    n--;
                }

                if (m + 1 >= mLen) {
                    n++;
                } else {
                    m++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalOrder = findDiagonalOrder(arr);
        for (int i = 0; i < diagonalOrder.length; i++) {
            System.out.println(diagonalOrder[i]);
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 环形链表
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


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


//    public ListNode detectCycle2(ListNode head) {
//
//    }

}