package chapter08;

import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest2 {
    @Test
    public void test() {
        ListNode head = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        int left = 2;
        int right = 5;

        Utils.assertListEqualsArray(ReverseLinkedList2.solution(head, left, right), new int[]{1, 5, 4, 3, 2, 6});
    }
}
