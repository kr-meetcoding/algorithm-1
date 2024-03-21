package chapter08;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeTwoSortedListsTest {
    @Test
    public void test() {
        int[][] inputs = {{1, 2, 5}, {1, 3, 4}};
        int[] answer = {1, 1, 2, 3, 4, 5};

        ListNode[] lists = Arrays.stream(inputs).map(Utils::arrayToList).toArray(ListNode[]::new);

        ListNode head = MergeTwoSortedLists.solution(lists[0], lists[1]);

        Utils.assertListEqualsArray(head, answer);
    }

}
