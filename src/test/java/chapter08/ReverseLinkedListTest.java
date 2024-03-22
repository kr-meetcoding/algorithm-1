package chapter08;

import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    @Test
    public void test() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        int[] answer = {6, 5, 4, 3, 2, 1};

        Utils.assertListEqualsArray(ReverseLinkedList.solution(input), answer);
    }
}
