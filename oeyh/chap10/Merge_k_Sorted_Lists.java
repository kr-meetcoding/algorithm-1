//package oeyh.chap10;
//import java.util.*;
//
//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {
//    }
//    ListNode(int val) {
//        this.val = val;
//    }
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class KComparator implements Comparator<ListNode> {
//    @Override
//    public int compare(ListNode o1, ListNode o2){
//        if(o1.val == o2.val) return 0;
//        else if (o1.val > o2.val) return 1;
//        else return -1;
//    }
//}
//class Solution{
//    public ListNode mergeKLists(ListNode[] lists){
//        List<Integer> answer = new ArrayList<>();
//        for (ListNode l : lists){
//            ListNode cur = l;
//            while(cur != null){
//                answer.add(cur.val);
//                cur = cur.next;
//            }
//        }
//
//        Collections.sort(answer);
//        ListNode head = new ListNode();
//        ListNode tmp = head;
//
//        for(int i : answer){
//            tmp.next = new ListNode(i);
//            tmp = tmp.next;
//        }
//        return head.next;
//    }
//
//}
//
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
//            if(o1.val > o2.val) return 1;
//            else if (o1.val < o2.val) return -1;
//            else return 0;
//        }) ;
//
//        ListNode head = new ListNode();
//        ListNode temp = head;
//
//        for (ListNode list : lists){
//            if(list != null) {
//                pq.add(list);
//            }
//        }
//
//        while(!pq.isEmpty()){
//            temp.next = pq.poll();
//            temp = temp.next;
//
//            if (temp.next != null) pq.add(temp.next);
//        }
//
//        return head.next;
//    }
//}