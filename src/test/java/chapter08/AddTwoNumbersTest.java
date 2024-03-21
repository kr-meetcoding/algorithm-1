package chapter08;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddTwoNumbersTest {
    @Test
    public void test() {
        ListNode[] lists = Arrays
                .stream(new int[][]{{2, 4, 3}, {5, 6, 2}})
                .map(Utils::arrayToList)
                .toArray(ListNode[]::new);

        Utils.assertListEqualsArray(AddTwoNumbers.solution(lists[0], lists[1]), new int[]{7, 0, 6});
    }
}
