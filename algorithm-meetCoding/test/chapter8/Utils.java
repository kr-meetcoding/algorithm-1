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
    // 두 연결 리스트의 노드 값을 비교하여 동일한지 확인하는 메소드
    public static boolean compareLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        // 두 리스트 중 하나라도 남아있으면 false 반환
        return list1 == null && list2 == null;
    }
}
