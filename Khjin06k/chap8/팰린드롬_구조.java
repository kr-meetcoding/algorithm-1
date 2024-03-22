package Khjin06k.chap8;

import java.util.Arrays;
import java.util.LinkedList;

// 문제 : 연결 리스트가 팰린드롬 구조인지 판별
// 입력 : 1 -> 2 -> 3 -> 2 -> 1
// 출력 : true

public class 팰린드롬_구조 {
    static class MySolution {
        public static boolean palindrom(LinkedList linkedList) {
            int length = linkedList.size();

            // 맨 처음과 맨 뒤가 동일하지 않으면 false, 반복문을 빠져나간다면 팰린드롬 구조이므로 true 반환
            for(int i = 0; i<(length%2==0?length/2:length/2+1); i++){
                if(linkedList.get(i) != linkedList.get(length-1-i)) return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println(MySolution.palindrom(linkedList1));

        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 4, 3, 2, 1));
        System.out.println(MySolution.palindrom(linkedList2));

    }
}
