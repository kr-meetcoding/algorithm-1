package deque;

public class 원형데크디자인 {
    class MyCircularDeque {

        static class DoublyLinkedListNode {
            DoublyLinkedListNode left;
            DoublyLinkedListNode right;
            int val;

            public DoublyLinkedListNode(int val) {
                this.val = val;
            }
        }

        int len;
        int k;
        DoublyLinkedListNode head;
        DoublyLinkedListNode tail;

        public MyCircularDeque(int k) {
            head = new DoublyLinkedListNode(0);
            tail = new DoublyLinkedListNode(0);

            head.right = tail;
            tail.left = head;

            this.k = k; // 큐 전체 크기
            this.len = 0; // 현재 큐의 크기
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }

            DoublyLinkedListNode node = new DoublyLinkedListNode(value);

            node.right = head.right;
            node.left = head;
            head.right.left = node;
            head.right = node;
            len++;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            DoublyLinkedListNode node = new DoublyLinkedListNode(value);

            node.left = tail.left;
            node.right = tail;
            tail.left.right = node;
            tail.left = node;
            len++;
            return true;
        }

        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }

            head.right.right.left = head;
            head.right = head.right.right;
            len--;

            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()) {
                return false;
            }

            tail.left.left.right = tail;
            tail.left = tail.left.left;
            len--;

            return true;
        }

        public int getFront() {
            return (isEmpty()) ? -1 : head.right.val;
        }

        public int getRear() {
            return (isEmpty()) ? -1 : tail.left.val;
        }

        public boolean isEmpty() {
            return len == 0;
        }

        public boolean isFull() {
            return len == k;
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
}
