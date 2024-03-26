import java.util.ArrayList;
import java.util.List;

public class 펠린드롬연결리스트 {
    class Solution {
        public static boolean isPalindrome(ListNode head) {
            ListNode tempNode = head;
            List<Integer> integerList = new ArrayList<>();
            while (tempNode != null) { // N
                integerList.add(tempNode.val);
                tempNode = tempNode.next;
            }

            ListNode tempNode2 = head;
            for (int i = integerList.size() - 1; i >= 0; i--) { // N
                if(tempNode2.val != integerList.get(i)){
                    return false;
                }
                tempNode2 = tempNode2.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(1,null);
        ListNode listNode3 = new ListNode(2,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);

        System.out.println(Solution.isPalindrome(listNode1));
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
