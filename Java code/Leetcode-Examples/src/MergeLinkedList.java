public class MergeLinkedList {
    public ListNode mergeLinkedList(ListNode first, ListNode second){
        ListNode mergedList = new ListNode(0);
        ListNode current = mergedList;
        while (first != null && second != null){
            if (first.val < second.val){
                current.next = first;
                first = first.next;
            }
            else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        current.next = (first != null) ? first : second;
        return mergedList.next;
    }
}
