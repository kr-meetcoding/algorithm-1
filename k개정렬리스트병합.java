package deque;

import java.util.PriorityQueue;

public class k개정렬리스트병합 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public static ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
                if (o1.val == o2.val) {
                    return 0;
                }
                if (o1.val > o2.val) {
                    return 1;
                }
                if (o1.val < o2.val) {
                    return -1;
                }
                return 0;
            });

            ListNode root = new ListNode(0);
            ListNode tail = root;

            for (ListNode node : lists) {
                if (node != null) {
                    pq.add(node); // NlogN
                }
            }

            while (!pq.isEmpty()) { // NlogN

                tail.next = pq.poll();
                tail = tail.next;

                if (tail.next != null) {
                    pq.add(tail.next);
                }
            }

            return root.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            if (next != null) {
                return String.valueOf(val) + " " + next.toString();
            } else {
                return String.valueOf(val);
            }

        }
    }

    public static void main(String[] args) {
        ListNode input1_3 = new ListNode(5);
        ListNode input1_2 = new ListNode(4, input1_3);
        ListNode input1_1 = new ListNode(1, input1_2);


        ListNode input2_3 = new ListNode(4);
        ListNode input2_2 = new ListNode(3, input2_3);
        ListNode input2_1 = new ListNode(1, input2_2);

        ListNode input3_2 = new ListNode(6);
        ListNode input3_1 = new ListNode(2, input3_2);


        ListNode[] input1 = new ListNode[]{input1_1, input2_1, input3_1};
        System.out.println(Solution.mergeKLists(input1));
    }
}
