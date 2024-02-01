import java.util.Iterator;
import java.util.PriorityQueue;

public class SortKList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pQueue = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
        if (lists.length < 1){
            return null;
        }
        ListNode merged = new ListNode(0);
        ListNode current = merged;
        for (ListNode head : lists){
            if (head != null){
                pQueue.offer(head);
            }

        }
        while(!pQueue.isEmpty()){
            ListNode minNode = pQueue.poll();
            current.next = minNode;
            current = current.next;
            if (minNode.next != null){
                pQueue.offer(minNode.next);
            }

        }

        return merged.next;
    }
}
