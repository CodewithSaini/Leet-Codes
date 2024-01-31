
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode middle = new ListNode(6);
        ListNode tail = new ListNode(4, null);
        head.next = middle;
        middle.next = tail;
        ReverseLinkedList rev = new ReverseLinkedList();
        ListNode newHead = rev.reverseList(head);
        while(newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }
}

