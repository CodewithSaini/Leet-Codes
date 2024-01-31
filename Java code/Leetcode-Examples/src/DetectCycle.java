import java.util.HashSet;

public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode current = head;
        while(current != null){
            if (set.contains(current)){
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }
}
