package dongkyun0713.chapter8;

// 연결리스트가 팰린드롬 구조인지 판별하는 클래스
// 입력 : 1,2,3,2,1
// 출력 : true
public class PalindromeLinkedList {
    public static void main(String[] args) {
        // 팰린드롬인지 확인할 연결 리스트 생성
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode node3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode node4 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode node5 = new PalindromeLinkedList.ListNode(1);

        // 연결 리스트 구성
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // 팰린드롬 여부 확인
        boolean isPalindrome = isPalindrome(node1);
        System.out.println(isPalindrome);
    }

    // 주어진 연결리스트가 팰린드롬인지 여부를 판별하는 메소드
    public static boolean isPalindrome(ListNode head) {
        // 빈 연결리스트나 단일 노드일 경우 팰린드롬으로 간주
        if (head == null || head.next == null)
            return true;

        // 중간 지점을 찾기 위한 두 개의 포인터 설정
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 중간을 기준으로 뒷부분을 역순으로 만들기
        ListNode reversedHalf = reverseLinkedList(slow.next);

        // 원래 연결리스트의 앞부분과 역순으로 만든 뒷부분을 비교
        while (reversedHalf != null) {
            if (head.val != reversedHalf.val)
                return false;
            head = head.next;
            reversedHalf = reversedHalf.next;
        }

        return true;
    }

    // 연결리스트를 역순으로 만드는 메소드
    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // 연결리스트 클래스
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
