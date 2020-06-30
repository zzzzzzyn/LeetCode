package 剑指offer.q31_栈的压入弹出序列;

import java.util.Stack;

public class Solution {

    // 用一个辅助栈
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0) return popped.length == 0;

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        int pushIndex = 0;
        while (popIndex < popped.length) {

            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }

            if (pushIndex < pushed.length) {
                stack.push(pushed[pushIndex]);
                pushIndex++;
            }

            // 退出条件，1所有元素压入栈，2栈不为空，3栈顶元素不为poped[popIndex]
            if (pushIndex == pushed.length && !stack.isEmpty() && stack.peek() != popped[popIndex]) return false;
        }

        return true;
    }

    public boolean validateStackSequences2(int[] pushed, int[] popped) {
        if (pushed.length == 0) return popped.length == 0;

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
