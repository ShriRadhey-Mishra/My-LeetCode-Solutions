package Medium;

public class Leetcode237 {
    public static void main(String[] args) {
        Leetcode237 obj = new Leetcode237();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head.traverse();
        obj.deleteNode(head.next.next);
        head.traverse();
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
