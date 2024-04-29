package oeyh;

public class test {
    class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);

        
    }
}
