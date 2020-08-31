package leetcode.q622_设计循环队列;

public class MyCircularQueue {

    private int[] elementData;
    private int size;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        elementData = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
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
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        // 空队列
        if (size == 0) return false;
        // 边界
        if (head == elementData.length - 1 && size != 0) {
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
     * Get the front item from the queue.
     */
    public int Front() {
        if (size == 0) return -1;
        return elementData[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (size == 0) return -1;
        return elementData[tail];

    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == elementData.length;
    }

}
