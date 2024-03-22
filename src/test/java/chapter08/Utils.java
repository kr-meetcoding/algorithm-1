package chapter08;

import org.junit.jupiter.api.Assertions;

public class Utils {
    public static ListNode arrayToList(int[] arr) {
        ListNode head = null;
        ListNode tail = null;

        for (int val : arr) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        return head;
    }

    public static void assertListEqualsArray(ListNode head, int[] arr) {
        ListNode cur = head;
        
        for (int val : arr) {
            Assertions.assertNotNull(cur);
            Assertions.assertEquals(val, cur.val);
            cur = cur.next;
        }

        Assertions.assertNull(cur);
    }
}
