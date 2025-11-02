package Medium;

public class Leetcode24 {
    public static void main(String[] args) {
        Leetcode24 obj = new Leetcode24();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        node.traverse();
        ListNode transformed = obj.swapPairs(node);
        transformed.traverse();
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }

        return dummy.next;
    }
}
