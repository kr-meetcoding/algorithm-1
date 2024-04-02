package chpater9;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int element) {
        queue.add(element);
        for (int i = 0; i < queue.size() -1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.element();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
