package stack;

import java.util.LinkedList;
import java.util.Queue;

public class 큐를이용한스택 {

    class MyStack {

        Queue<Integer> queue = new LinkedList<>();

        public MyStack() {
        }

        // 1 2 3 4 5
        // 6 1 2 3 4 5
        public void push(int x) {
            queue.add(x);
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.remove());
            }
        }

        public int pop() {

            return queue.remove();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.size() == 0;
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
