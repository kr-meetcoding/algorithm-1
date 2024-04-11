package oeyh.chap10;

class MyCircularDeque {
    private int[] deque;

    private int front;
    private int rear;

    private int max;
    private int size;


    public MyCircularDeque(int k) {
        this.deque = new int[k];
        this.max = k;
        this.rear = 1;

    }

    public boolean insertFront(int value) {
        if (this.isFull()) {
            return false;
        } else {
            this.front = (this.front + 1) % this.max;
            this.deque[this.front] = value;
            this.size++;
            return true;
        }
    }

    public boolean insertLast(int value) {
        if (this.isFull()) {
            return false;
        } else {
            this.rear = ((this.rear - 1) + this.max) % this.max;
            this.deque[this.rear] = value;
            this.size++;
            return true;
        }
    }

    public boolean deleteFront() {
        if (this.isEmpty()) {
            return false;
        } else {
            this.front = ((this.front - 1) + this.max) % this.max;
            this.size--;
            return true;
        }
    }

    public boolean deleteLast() {
        if (this.isEmpty()) {
            return false;
        } else {
            this.rear = (this.rear + 1) % this.max;
            this.size--;
            return true;
        }
    }

    public int getFront() {
        return this.size == 0 ? -1 : this.deque[this.front];
    }

    public int getRear() {
        return this.size == 0 ? -1 : this.deque[this.rear];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.max;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */