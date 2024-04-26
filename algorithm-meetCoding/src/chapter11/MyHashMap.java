package chapter11;

public class MyHashMap {
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    final Node[] nodes = new Node[100000];

    public void put(int key, int value) {
        int index = key % nodes.length;
        Node node = findNodeByKey(index, key);

        if (node != null) {
            node.value = value;
        } else {
            addToEnd(index, key, value);
        }
    }


    public int get(int key) {
        int index = key % nodes.length;
        Node node = findNodeByKey(index, key);
        return node != null ? node.value : -1;
    }

    public void remove(int key) {
        int index = key % nodes.length;
        Node node = nodes[index];
        Node prev = null;

        while (node != null) {
            if (node.key == key) {
                removeNode(prev, node, index);
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    private Node findNodeByKey(int index, int key) {
        Node node = nodes[index];
        while (node != null) {
            if (node.key == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private void addToEnd(int index, int key, int value) {
        Node node = nodes[index];
        if (node == null) {
            nodes[index] = new Node(key, value);
            return;
        }

        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(key, value);
    }

    private void removeNode(Node prev, Node node, int index) {
        if (prev == null) {
            nodes[index] = node.next;
        } else {
            prev.next = node.next;
        }
    }

}
