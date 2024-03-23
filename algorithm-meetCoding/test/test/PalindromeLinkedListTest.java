package test;

import static org.junit.jupiter.api.Assertions.*;

import chapter8.ListNode;
import chapter8.PalindromeLinkedList;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {
    @Test
    public void emptyListTest() {
        ListNode input = null; // 빈 리스트
        assertTrue(PalindromeLinkedList.isPalindrome(input));
    }

    @Test
    public void palindromeOddTest() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 2, 1});
        assertTrue(PalindromeLinkedList.isPalindrome(input));
    }

    @Test
    public void palindromeEvenTest() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 3, 2, 1});
        assertTrue(PalindromeLinkedList.isPalindrome(input));
    }

    @Test
    public void nonPalindromeTest() {
        ListNode input = Utils.arrayToList(new int[]{1, 2, 3, 4, 5}); // 펠린드롬이 아닌 리스트
        assertFalse(PalindromeLinkedList.isPalindrome(input));
    }

}