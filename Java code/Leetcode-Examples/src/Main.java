import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        ListNode head = new ListNode(1);
        ListNode middle = new ListNode(2);
        ListNode tail = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5, null);
        head.next = middle;
        middle.next = tail;
        tail.next = three;
        three.next = four;
        ListNode second = new ListNode(3, null);
        ListNode m = new ListNode(8, null);
        ListNode t = new ListNode(14, null);

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
        }
        MergeSortLinkedList sort = new MergeSortLinkedList();
        ListNode sorted = sort.sortLinkedList(head);
        ListNode curr = sorted;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }*/
        int[][] arr = {{1,2}, {3, 5},{6,7 }, {8, 10}, {12, 16}};
        int[] temp = {4, 8};
        InsertInterval merge = new InsertInterval();
        int[][] re =  merge.insert(arr, temp);
        for (int[] i: re){
            System.out.println(i[0]);
        }
    }
}

