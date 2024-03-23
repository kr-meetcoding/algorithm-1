package Khjin06k.chap8;

// 문제 : 연결 리스트를 뒤집어라
// 입력 : 1->2->3->4->5->6
// 출력 : 6->5->4->3->2->1

public class 역순_연결_리스트 {
    static class MySolution {
        public static ListNode reverseLinkedList(ListNode list){
            ListNode answer = new ListNode();
            // sol2번이 거꾸로 나왔기에 이것도 앞에서부터 차근히 ListNode에 저장 >> 역순으로 변경됨
            while(list != null){
                answer = new ListNode(list.val, answer);
                list = list.next;
            }
            return answer;
        }

    }

    public static void main(String[] args) {
        ListNode list = ListNode.of(1, 2, 3, 4, 5, 6);

        System.out.println(MySolution.reverseLinkedList(list));
    }
}
