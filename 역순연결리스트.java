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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }

        ListNode root = new ListNode(Integer.MIN_VALUE);
        //시작점 찾기
        root.next = head;
        ListNode start = root;
        for(int i = 0; i < left -1; i++){
            start = start.next;
        }
        ListNode end = start.next;
        
        //범위 구간 만큼 순서 바꾸기
        for(int i = 0 ; i < right - left ; i++){
            ListNode tmp = start.next;
            start.next = end.next;
            end.next = end.next.next;
            start.next.next = tmp;
        }

        return root.next;




    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next =null;

        while (current != null) {
            // (#null->1->2->3->4->5->#null)
            //  prev=>cur=>         
            next = current.next; //다음노드값 지정              
            current.next = prev; //현재노드의 다음으로 prev노드 지정 
            prev = current;   //이전노드는 현재 노드로 지정  
            current = next;   //지정한 next의 다음노드를 현재노드로지정
            // (#null<-1<-2<-3<-4<-5<-#null)
            //                   prev=>cur=>
        }
        
        return prev;

    }
}
