public class 페어의노드스왑 {

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode swapHead = head.next; // (1 2) 3 ->  (2 1) 3-연결재귀
            head.next = swapPairs(head.next.next);
            swapHead.next = head;
            return swapHead;

        }
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
