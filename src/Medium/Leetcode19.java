package Medium;

public class Leetcode19 {
    public static void main(String[] args) {
        Leetcode19 obj = new Leetcode19();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        list.traverse();
        int n = 2;
        ListNode removedNthFromEnd = obj.removeNthFromEnd(list, n);
        removedNthFromEnd.traverse();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int size = 1;
        ListNode fast = head;
        ListNode toDelete = head;
        ListNode prev = head;

        while (fast.next != null) {
            fast = fast.next;
            size++;
        }

        if (size == 1) return null;

        int location = size - n;

        if (location == 0) return head.next;

        for (int i = 0; i < location; i++) {
            if (i == 0) toDelete = toDelete.next;
            else {
                toDelete = toDelete.next;
                prev = prev.next;
            }
        }

        prev.next = toDelete.next;

        return head;
    }
}
