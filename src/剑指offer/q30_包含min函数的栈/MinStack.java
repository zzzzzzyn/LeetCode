package 剑指offer.q30_包含min函数的栈;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (dataStack.isEmpty()) {
            dataStack.push(x);
            minStack.push(x);
        } else {
            dataStack.push(x);
            minStack.push(x < minStack.peek() ? x : minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
