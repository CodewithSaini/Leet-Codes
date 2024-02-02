public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode start = head;
        ListNode middle = getMiddle(start);
        ListNode second = middle.next;
        middle.next = null;
        ListNode secondReverse = reverse(second);
        while (secondReverse != null){
            ListNode temp = start.next;
            start.next = secondReverse;
            start = temp;
            ListNode temp2 = secondReverse.next;
            secondReverse.next = start;
            secondReverse = temp2;

        }
        head = start;
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
        ListNode next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
