/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //값을 계산할 임시노드 선언
        ListNode node = new ListNode(Integer.MIN_VALUE);
        // 임시노드를 첫번째 노드로 선언
        ListNode root = node;

        //자릿수의합(sum), 자리올림수(carry),나머지(ramainder)를 저장할 변수 선언
        int sum = 0;
        int carry = 0;
        int remainder=0;

        //모든 연결리스트를 끝까지 순회하고, 자리올림수도 0이 될때까지 진행
        while(l1 != null || l2!=null || carry !=0){
            sum = 0;
            //첫번째 연결리스트 합산 및 진행
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            //두번째 연결리스트 합산 및 진행
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            //자리올림수 처리 연산-> 다음 노드로 보내기
            remainder = (sum+carry) % 10;
            carry = (sum+carry) /10;
            node.next = new ListNode(remainder);
            node = node.next;
        }
        //첫번째 노드는 임시 노드이므로 그 다음부터 결과로 리턴
        return root.next;
    }
}
