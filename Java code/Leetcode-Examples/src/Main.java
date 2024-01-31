
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
        MergeLinkedList merge = new MergeLinkedList();
        ListNode merged = merge.mergeLinkedList(head, second);
        while(merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }

    }
}

