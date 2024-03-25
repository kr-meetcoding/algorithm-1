package chapter8;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    @Test
    public void addTwoNumbersTest1() {
        ListNode list1 = Utils.arrayToList(new int[]{2, 4, 3});
        ListNode list2 = Utils.arrayToList(new int[]{5, 6, 2});
        ListNode output = AddTwoNumbers.addTwoNumbers(list1, list2);

        ListNode answer = Utils.arrayToList(new int[]{7, 0, 6});
        assertTrue(Utils.compareLists(output, answer));
    }
}