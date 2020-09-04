package leetcode.q225_用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue;
    private int top;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offer(x);
        top = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> helpQueue = new LinkedList<>();
        while (queue.size() > 1) {
            top = queue.poll();
            helpQueue.offer(top);
        }
        Integer res = queue.poll();
        queue = helpQueue;
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
