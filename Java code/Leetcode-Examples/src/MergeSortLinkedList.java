public class MergeSortLinkedList {
    public ListNode sortLinkedList(ListNode list){
        if (list == null || list.next == null){
            return list;
        }
        ListNode middle = getMiddle(list);
        ListNode nextToMiddle = middle.next;

        middle.next = null;

        ListNode left = list;
        ListNode right = nextToMiddle;

        ListNode sortedList = mergeList(left, right);
        return sortedList;

    }
    private ListNode getMiddle(ListNode head){
        if (head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode mergeList(ListNode left, ListNode right){
        ListNode result = null;
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        if (left.val <= right.val){
            result = left;
            left = mergeList(left.next, right);
        }
        else{
            result = right;
            right = mergeList(left, right.next);
        }
        return result;

    }
}
