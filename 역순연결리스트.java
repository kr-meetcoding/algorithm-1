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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next =null;

        while (current != null) {
            // (#null->1->2->3->4->5->#null)
            //  prev=>cur=>
            next = current.next; //다음노드값 지정              
            current.next = prev; //현재노드의 다음으로 prev노드 지정 
            prev = current;   //이전노드는 현재 노드로 지정  
            current = next;   //지정한 next의 다음노드를 현재노드로지정
        }
        
        return prev;
    }
}
