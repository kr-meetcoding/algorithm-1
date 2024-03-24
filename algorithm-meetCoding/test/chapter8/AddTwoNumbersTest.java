package chapter8;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    @Test
    public void addTwoNumbersTest1() {
        ListNode list1 = Utils.arrayToList(new int[]{2, 4, 3});
        ListNode list2 = Utils.arrayToList(new int[]{5, 6, 2});
        BigInteger output = AddTwoNumbers.addTwoNumbers(list1, list2);
        assertEquals(new BigInteger("607"), output);
    }

    @Test
    public void addTwoNumbersTest2() {
        ListNode list1 = Utils.arrayToList(new int[]{1, 2, 3, 9});
        ListNode list2 = Utils.arrayToList(new int[]{1, 2, 3, 9});
        BigInteger output = AddTwoNumbers.addTwoNumbers(list1, list2);
        assertEquals(new BigInteger("18642"), output);
    }
}