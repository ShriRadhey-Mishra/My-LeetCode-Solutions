package Medium;

public class Leetcode2 {
    public static void main(String[] args) {
        Leetcode2 obj = new Leetcode2();
        ListNode list1 = new ListNode(1, new ListNode(0, new ListNode(1)));
        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(1))));
        ListNode result = obj.addTwoNumbers(list1, list2);
        result.traverse();
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.next = new ListNode(sum%10);
            result = result.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}
