package leetcode.q155_最小栈;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    // 辅助栈
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else if (minStack.peek() < x) {
            minStack.push(minStack.peek());
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        System.out.println(minStack.getMin());
    }
}