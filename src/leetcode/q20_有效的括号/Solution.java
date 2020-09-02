package leetcode.q20_有效的括号;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        if (s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                    continue;
                }
                if (stack.peek() + 1 == s.charAt(i) || stack.peek() + 2 == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * 反向插入，最后进行比较
     */
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
