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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     if(list1==null){//한쪽 줄이 null로 끝나면 반대편 노드 리턴.
            return list2;  
      }else if(list2 == null){ 
         return list1;
      } 

     if(list1.val < list2.val){//정렬 된 두리스트중 작은수가 차례로 리스트에 추가됨.
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
     }else{
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
     }

}
}
