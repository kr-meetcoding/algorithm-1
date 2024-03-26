public class 두정렬리스트의병합 {
    class Solution { // stack 구조의 재귀
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
            if (list1.val > list2.val) {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }

            return null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode13 = new ListNode(4, null);
        ListNode listNode12 = new ListNode(2, listNode13);
        ListNode listNode11 = new ListNode(1, listNode12);

        ListNode listNode23 = new ListNode(4, null);
        ListNode listNode22 = new ListNode(3, listNode23);
        ListNode listNode21 = new ListNode(1, listNode22);


        ListNode res = Solution.mergeTwoLists(listNode11, listNode21);

        while (res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println(res.val);
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
