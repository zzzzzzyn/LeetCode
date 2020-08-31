package leetcode.q641_设计循环双端队列;

public class MyCircularDeque {

    private int[] elementData;
    private int size;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        elementData = new int[k];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        // 满了
        if (size == elementData.length) return false;
        if (size == 0) {
            elementData[head] = value;
        } else {
            // 边界
            if (head == 0) {
                head = elementData.length - 1;
            } else {
                head--;
            }
            elementData[head] = value;
        }
        size++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (size == elementData.length) return false;

        if (size == 0) {
            elementData[tail] = value;
        } else {
            // 边界
            if (tail == elementData.length - 1) {
                tail = 0;
            } else {
                tail++;
            }
            elementData[tail] = value;
        }
        size++;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        // 空队列
        if (size == 0) return false;
        // 边界
        if (head == elementData.length - 1) {
            head = 0;
        } else {
            head++;
        }
        size--;
        if (size == 0) {
            head = 0;
            tail = 0;
        }
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (size == 0) return false;
        // 边界
        if (tail == 0) {
            tail = elementData.length - 1;
        } else {
            tail--;
        }
        size--;
        if (size == 0) {
            head = 0;
            tail = 0;
        }
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (size == 0) return -1;
        return elementData[head];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (size == 0) return -1;
        return elementData[tail];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return size == elementData.length;
    }
}
