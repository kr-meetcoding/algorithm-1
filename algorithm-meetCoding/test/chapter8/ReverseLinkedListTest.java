package chapter8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
    @Test
    public void reverseLinkedListTest() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode answer = Utils.arrayToList(new int[]{6, 5, 4, 3, 2, 1});

        ListNode result = ReverseLinkedList.reverseLinkedList(input);
        assertTrue(Utils.compareLists(result, answer));
    }

    @Test
    public void reverseLinkedListFailureTest() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode answer = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});

        ListNode result = ReverseLinkedList.reverseLinkedList(input);
        assertFalse(Utils.compareLists(result, answer));
    }
}