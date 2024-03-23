package Khjin06k.chap8;

public class 두_수의_덧셈 {
    static class MySolution {
        public static int addTwoNumber(ListNode list1, ListNode list2) {
            String num1 = "";
            String num2 = "";

            list1 = 역순_연결_리스트.MySolution.reverseLinkedList(list1);
            list2 = 역순_연결_리스트.MySolution.reverseLinkedList(list2);

            while(list1 != null && list2 != null){
                num1 += list1.val == 0 ? "" : list1.val;
                num2 += list2.val==0 ? "" : list2.val;
                list1 = list1.next;
                list2 = list2.next;
            }

            return Integer.parseInt(num1)+Integer.parseInt(num2);
        }
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.of(2, 4, 3, 2);
        ListNode list2 = ListNode.of(5, 6, 2);

        // 만약 두 리스트의 길이가 다르다면? >> 해당 경우도 더하기 가능
        System.out.println(MySolution.addTwoNumber(list1, list2));
    }
}
