package stack;

import java.util.ArrayList;

public class 원형큐디자인 {
    class MyCircularQueue { // 선입선출
        int[] queue;
        int front = 0;
        int rear = -1;
        int len = 0;

        public MyCircularQueue(int k) {
            this.queue = new int[k];
        }

        public boolean enQueue(int value) {
            if (!isFull()) {
                rear++;
                rear = rear >= queue.length ? rear - queue.length : rear;
                queue[rear] = value;
                len++;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                front++;
                front = front >= queue.length ? front - queue.length : front;
                len--;
                return true;
            }
            return false;
        }

        public int Front() {
            return isEmpty() ? -1 : queue[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : queue[rear];
        }

        public boolean isEmpty() {
            return len == 0;
        }

        public boolean isFull() {
            return len == queue.length;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
