package Easy;

public class Leetcode83 {
    public static void main(String[] args) {
        Leetcode83 obj = new Leetcode83();
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))));
        ListNode setList = obj.deleteDuplicates(list);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while (newHead != null && newHead.next != null) {
            if (newHead.val == newHead.next.val) {
                newHead.next = newHead.next.next;
            } else {
                newHead = newHead.next;
            }
        }
//        head.traverse();
        return head;
    }
}
