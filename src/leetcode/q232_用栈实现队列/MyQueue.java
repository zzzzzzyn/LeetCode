package leetcode.q232_用栈实现队列;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> dataStack;
    private Stack<Integer> helpStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        dataStack = new Stack<>();
        helpStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        dataStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!dataStack.isEmpty()) {
            helpStack.push(dataStack.pop());
        }
        Integer res = helpStack.pop();
        while (!helpStack.isEmpty()) {
            dataStack.push(helpStack.pop());
        }
        return res;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!dataStack.isEmpty()) {
            helpStack.push(dataStack.pop());
        }
        Integer res = helpStack.peek();
        while (!helpStack.isEmpty()) {
            dataStack.push(helpStack.pop());
        }
        return res;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return dataStack.isEmpty();
    }
}
