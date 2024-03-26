import java.util.ArrayList;
import java.util.List;

public class 두수의덧셈 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> resList = new ArrayList<>();

        int val = 0;
        boolean up = false;
        while (l1 != null || l2 != null) { // N
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            val = val1 + val2;
            if (up) {
                val += 1;
            }

            up = val >= 10;
            if (up) {
                val -= 10;
            }
            resList.add(val);

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (up) {
            resList.add(1);
        }

        ListNode resNode = new ListNode(resList.get(resList.size() - 1), null);
        for (int i = resList.size() - 2; i >= 0; i--) { // N
            resNode = new ListNode(resList.get(i), resNode);
        }
        return resNode;
    }

    public static void main(String[] args) {
        ListNode listNode17 = new ListNode(9, null);
        ListNode listNode16 = new ListNode(9, listNode17);
        ListNode listNode15 = new ListNode(9, listNode16);
        ListNode listNode14 = new ListNode(9, listNode15);
        ListNode listNode13 = new ListNode(9, listNode14);
        ListNode listNode12 = new ListNode(9, listNode13);
        ListNode listNode11 = new ListNode(9, listNode12);

        ListNode listNode24 = new ListNode(9, null);
        ListNode listNode23 = new ListNode(9, listNode24);
        ListNode listNode22 = new ListNode(9, listNode23);
        ListNode listNode21 = new ListNode(9, listNode22);

        addTwoNumbers(listNode11, listNode21);
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
