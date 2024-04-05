package chapter10;
/*
• MyCircularDeque(k): 데크 크기를 K로 지정하는 생성자다.
• insertFront(): 데크 처음에 아이템을 추가하고 성공할 경우 True를 반환한다.
• insertLast(): 데크 마지막에 아이템을 추가하고 성공할 경우 True를 반환한다.
• deleteFront(): 데크 처음에 아이템을 삭제하고 성공할 경우 True를 반환한다.
• deleteLast(): 데크 마지막에 아이템을 삭제하고 성공할 경우 True를 반환한다.
• getFront(): 데크의 첫번째 아이템을 가져온다. 데크가 비어있다면 1을 반환한다.
• getRear(): 데크의 마지막 아이템을 가져온다. 데크가 비어있다면 1을 반환한다.
• isEmpty(): 데크가 비어있는지 여부를 판별한다.
• isFull(): 데크가 가득 차 있는지 여부를 판별한다.
*/

public class DesignCircularDeque {
    public static class DoubleLinkedList {
        DoubleLinkedList prev;
        DoubleLinkedList next;
        int val;

        public DoubleLinkedList(int val) {
            this.val = val;
        }

        public DoubleLinkedList(int val, DoubleLinkedList prev, DoubleLinkedList next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    int currentSize;
    int totalSize;
    DoubleLinkedList head;
    DoubleLinkedList tail;

    public DesignCircularDeque(int totalSize) {
        head = new DoubleLinkedList(0);
        tail = new DoubleLinkedList(0);
        head.next = tail;
        head.prev = head;
        this.totalSize = totalSize;
        this.currentSize = 0;
    }

    public boolean insertFront(int val) {
        if (isFull()) {
            return false;
        }

        DoubleLinkedList node = new DoubleLinkedList(val, head, head.next);
        head.next.prev = node;
        head.next = node;
        currentSize++;
        return true;
    }

    public boolean insertLast(int val) {
        if (isFull()) {
            return false;
        }

        DoubleLinkedList node = new DoubleLinkedList(val, tail.prev, tail);
        tail.prev.next = node;
        tail.prev = node;
        currentSize++;
        return true;
    }

    public boolean isFull() {
        return currentSize == totalSize;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        head.next.next.prev = head;
        head.next = head.next.next;
        currentSize--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
        currentSize--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return head.next.val;
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.prev.val;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }
}

