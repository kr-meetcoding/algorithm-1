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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        
        ListNode node = head;
        while(node !=null){ //deque에 노드 입력
            deque.add(node.val);
            node = node.next;
        }

        while (!deque.isEmpty()&& deque.size()>1){//deque순회하면서 
            if(deque.pollFirst() != deque.pollLast()){ //양 끝의 값 비교 
                return false;
            }
        }

        return true;
    }
}
