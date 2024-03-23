package chapter08;

import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {
    @Test
    public void test() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5, 6});
        int[] answer = {2, 1, 4, 3, 6, 5};
        
        Utils.assertListEqualsArray(SwapNodesInPairs.solution(input), answer);
    }
}
