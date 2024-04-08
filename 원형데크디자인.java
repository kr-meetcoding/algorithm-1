class MyCircularDeque {

       class DoublyLinkedList {
            DoublyLinkedList left;
            DoublyLinkedList right;
            int val;

            public DoublyLinkedList (int val) {
                this.val = val;
            }
        }

        int len;
        int k;
        DoublyLinkedList head;
        DoublyLinkedList tail;

        public MyCircularDeque(int k) {
            this.k = k;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = new DoublyLinkedList(value);
                tail = head;
            } else {
                DoublyLinkedList node = new DoublyLinkedList(value);
                head.left = node;
                node.right = head;
                head = node;
            }
            len++;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()){
                head = new DoublyLinkedList(value);
                tail = head;
            } else {
                DoublyLinkedList node = new DoublyLinkedList(value);
                tail.right = node;
                node.left = tail;
                tail = node;
            }
            len++;
            return true;
        }

        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }
            if (len == 1) {
                head = null;
                tail = null;
            } else {
                head = head.right;
                head.left = null;
            }
            len--;
            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()) {
                return false;
            }
            if (len == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.left;
                tail.right = null;
            }
            len--;
            return true;
        }

        public int getFront() {
            if (len == 0) {
                return -1;
            }
            return head.val;
        }

        public int getRear() {
            if (len == 0) {
                return -1;
            }
            return tail.val;
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
