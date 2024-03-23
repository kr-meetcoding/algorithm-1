package chapter8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoSortedListsTest() {
        ListNode list1 = Utils.arrayToList(new int[]{1, 2, 5});
        ListNode list2 = Utils.arrayToList(new int[]{1, 3, 4});
        ListNode mergedList = Utils.arrayToList(new int[]{1, 1, 2, 3, 4, 5});

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertTrue(Utils.compareLists(result, mergedList));
    }

    @Test
    public void mergeTwoSortedListsTestFalse() {
        ListNode list1 = Utils.arrayToList(new int[]{1, 2, 5});
        ListNode list2 = Utils.arrayToList(new int[]{1, 3, 4});
        ListNode mergedList = Utils.arrayToList(new int[]{1, 1, 2, 3, 4, 5, 8, 9});

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertFalse(Utils.compareLists(result, mergedList));
    }
}
