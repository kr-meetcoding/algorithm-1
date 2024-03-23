package Khjin06k.chap8;

import java.util.Arrays;
import java.util.LinkedList;

// 정렬되어 있는 두 연결 리스트를 합쳐라.
// 입력 : 1 -> 2-> 5 / 1 -> 3-> 4
// 출력 : 1-> 1-> 2-> 3-> 4-> 5

public class 두_정렬_리스트의_병합 {
    static class MySolution{

        public static ListNode mergeTwoSortedList(ListNode list1, ListNode list2) {
            ListNode answer = new ListNode();

            // 두 리스트 중 하나라도 빈 리스트라면 나머지 리스트가 정답
            if(list1 == null) return list2;
            if(list2 == null) return list1;

            // 둘 다 빈 리스트가 아니라면 비교하며 리스트 저장 후 리턴
            while(list1 != null && list2 != null){

                // 맨 처음 val 비교
                if(list1.val >= list2.val){
                    answer = new ListNode(list2.val, answer);
                    list2 = list2.next;
                }else{
                    answer = new ListNode(list1.val, answer);
                    list1 = list1.next;
                }
            }

            int last = list1 == null ? list2.val : list1.val;
            answer = new ListNode(last, answer);
            return answer;
        }

    }

    public static void main(String[] args) {
        // 두 리스트는 정렬된 리스트
        ListNode list1 = ListNode.of(1, 2, 5);
        ListNode list2 = ListNode.of(1, 3, 4);

        ListNode answer = MySolution.mergeTwoSortedList(list1, list2);
        System.out.println(answer); // 답은 나오지만 거꾸로 출력됨,,, >> 추후 다시 생각하기
    }
}
