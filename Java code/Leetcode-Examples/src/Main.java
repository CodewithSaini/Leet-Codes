import java.util.*;
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode middle = new ListNode(12);
        ListNode tail = new ListNode(10, null);
        head.next = middle;
        middle.next = tail;
        ListNode second = new ListNode(3);
        ListNode m = new ListNode(8);
        ListNode t = new ListNode(14, null);
        second.next = m;
        m.next = t;
        ListNode third = new ListNode(1);
        ListNode m3 = new ListNode(5);
        ListNode t3 = new ListNode(9, null);
        /*
        ListNode[] lists = {head, second, third};
        SortKList sortK = new SortKList();
        ListNode merged = sortK.mergeKLists(lists);
        ListNode curr = merged;
        while (curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }*/
        MergeSortLinkedList sort = new MergeSortLinkedList();
        ListNode sorted = sort.sortLinkedList(head);
        ListNode curr = sorted;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }


    }
}

