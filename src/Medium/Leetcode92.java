package Medium;

public class Leetcode92 {
    public static void main(String[] args) {
        Leetcode92 obj = new Leetcode92();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        list.traverse();
        ListNode reversed = obj.reverseBetween(list, 2, 4);
        reversed.traverse();
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) prev = prev.next;

        ListNode curr = prev.next, next = null, prevReversed = null;

        for (int i = 0; i <= right-left; i++) {
            next = curr.next;
            curr.next = prevReversed;
            prevReversed = curr;
            curr = next;
        }

        prev.next.next = curr;
        prev.next = prevReversed;

        return dummy.next;
    }
}
