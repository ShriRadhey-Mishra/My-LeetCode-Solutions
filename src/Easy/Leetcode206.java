package Easy;

public class Leetcode206 {
    public static void main(String[] args) {
        Leetcode206 obj = new Leetcode206();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        list.traverse();
        ListNode reversed = obj.reverseList(list);
        reversed.traverse();
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
