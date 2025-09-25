package Hard;

import java.util.PriorityQueue;

public class Leetcode23 {
    public static void main(String[] args) {
        Leetcode23 obj = new Leetcode23();

        ListNode list1 = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))));
        list1.traverse();

        ListNode list2 = new ListNode(2,
                new ListNode(3,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(8)))));
        list2.traverse();

        ListNode list3 = new ListNode(1,
                new ListNode(1,
                        new ListNode(5,
                                new ListNode(9,
                                        new ListNode(10)))));
        list3.traverse();

        ListNode mergedLists = obj.mergeKLists(new ListNode[]{list1, list2, list3});
        mergedLists.traverse();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if (k == 0) {
            return null;
        }
        if (k == 1) {
            return lists[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode output = new ListNode();

        for (ListNode ll : lists) {
            while (ll != null) {
                pq.add(ll.val);
                ll = ll.next;
            }
        }

        ListNode head = output;
        while (!pq.isEmpty()) {
            output.next = new ListNode(pq.poll());
            output = output.next;
        }

        return head.next;
    }
}