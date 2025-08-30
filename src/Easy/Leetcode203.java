package Easy;

public class Leetcode203 {
    public static void main(String[] args) {
        Leetcode203 obj = new Leetcode203();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        int removeVal = 6;
        list.traverse();
        ListNode newList = obj.removeElements(list, removeVal);
        newList.traverse();
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        if (head.next != null) {
            fast = fast.next;
        }
        while (fast != null) {
            if (fast.val == val) {
                fast = fast.next;
                slow.next = fast;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return (head.val != val)? head: head.next;
    }
}
