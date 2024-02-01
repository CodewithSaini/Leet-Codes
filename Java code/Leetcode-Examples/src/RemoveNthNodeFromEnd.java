public class RemoveNthNodeFromEnd {
    public ListNode removeNode(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        for (int i=0; i<n; i++){
            if (fast != null){
                fast = fast.next;
            }
        }
        while (fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //System.out.println(slow.val + fast.val);
        if (prev != null){
            prev.next = slow.next;
            slow.next = null;
        }
        else {
            head = head.next;
        }

        return head;
    }
}
