package chapter8;

import chapter8.ListNode;

public class Utils {
    public static ListNode arrayToList(int[] arr) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        for (int val : arr) {
            ListNode newNode = new ListNode(val);
            tail.next = newNode;
            tail = newNode;
        }

        return head.next;
    }
    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
