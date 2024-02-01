public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode start = head;
        ListNode middle = getMiddle(head);
        ListNode second = middle.next;
        middle.next = null;
        ListNode secondReverse = reverse(second);
        while (secondReverse != null){
            System.out.println(secondReverse.val);
            secondReverse = secondReverse.next;
        }
    }

    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }

    }
}
