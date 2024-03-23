package chapter08;

import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {
    @Test
    public void test() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        int[] answer = {1, 3, 5, 2, 4, 6};

        Utils.assertListEqualsArray(OddEvenLinkedList.solution(input), answer);
    }
}
