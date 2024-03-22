package chapter08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {
    @Test
    public void test() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 2, 1});

        assertTrue(PalindromeLinkedList.solution(input));
    }
}
