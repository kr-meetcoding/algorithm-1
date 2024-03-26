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
    public ListNode oddEvenList(ListNode head) {
        if(head ==null){
           return null;
        }

        ListNode odd = head;  //홀수
        ListNode even = head.next; //짝수
        ListNode evenHead = even; //짝수 첫번째 노드

        while(even != null && even.next != null){
            odd.next = odd.next.next; //다음홀수
            even.next = even.next.next; //다음짝수

            odd = odd.next; 
            even = even.next;
        }

            odd.next = evenHead; //짝수의 첫번째 노드를 연결
             
            return head;

    }
}
