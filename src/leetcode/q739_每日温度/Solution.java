package leetcode.q739_每日温度;

import java.util.Stack;

public class Solution {

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                T[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        /**
         * 栈中索引位置置0
         */
        while (!stack.isEmpty()) {
            T[stack.pop()] = 0;
        }
        return T;
    }

}