import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        // 从左上角当做二叉树来搜索，上边的值小，右边的值大
        int m = matrix.length - 1, n = 0;
        while (m >= 0 && n < matrix[0].length) {
            if (matrix[m][n] == target) {
                return true;
            } else if (target < matrix[m][n]) {
                m--;
            } else {
                n++;
            }
        }

        return false;
    }

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
        Solution.ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 环形链表
    public boolean hasCycle(Solution.ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        Solution.ListNode slow = head;
        Solution.ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    public Solution.ListNode detectCycle(Solution.ListNode head) {
        HashSet<Solution.ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.add(head)) {
                head = head.next;
            } else {
                return head;
            }
        }

        return null;
    }


    public Solution.ListNode getIntersectionNode(Solution.ListNode headA, Solution.ListNode headB) {
        HashSet<Solution.ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }


    public Solution.ListNode removeNthFromEnd(Solution.ListNode head, int n) {
        Solution.ListNode slow = head;
        Solution.ListNode fast = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char right = stack.pop().charValue();
                if (right == '(' && c != ')') return false;
                if (right == '[' && c != ']') return false;
                if (right == '{' && c != '}') return false;
            }
        }

        return stack.isEmpty();
    }


    class MyQueue {

        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack();
            out = new Stack();
        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }

            return out.pop();
        }

        public int peek() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }

            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }
}
