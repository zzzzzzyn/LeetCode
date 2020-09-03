package leetcode.q150_逆波兰表达式求值;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        List<String> list = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        // 这里给res初值是防止tokens数组长度为1的情况
        int res = Integer.valueOf(tokens[0]);
        for (int i = 0; i < tokens.length; i++) {
            if (list.contains(tokens[i])) {
                Integer i2 = stack.pop();
                Integer i1 = stack.pop();
                res = calculation(i1, i2, tokens[i]);
                stack.push(res);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return res;
    }

    private int calculation(Integer i1, Integer i2, String operator) {
        if (operator.equals("+")) {
            return i1 + i2;
        } else if (operator.equals("-")) {
            return i1 - i2;
        } else if (operator.equals("*")) {
            return i1 * i2;
        } else {
            return i1 / i2;
        }
    }
}