
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode middle = new ListNode(6);
        ListNode tail = new ListNode(10, null);
        head.next = middle;
        middle.next = tail;
        ListNode second = new ListNode(3);
        ListNode m = new ListNode(8);
        ListNode t = new ListNode(14, null);
        second.next = m;
        m.next = t;
        ReverseLinkedList rev = new ReverseLinkedList();
        ListNode newHead = rev.reverseList(head);
        while(newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }
}

