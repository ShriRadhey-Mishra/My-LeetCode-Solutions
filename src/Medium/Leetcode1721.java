package Medium;

public class Leetcode1721 {
    public static void main(String[] args) {
        Leetcode1721 obj = new Leetcode1721();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head.traverse();
        int k = 2;
        ListNode list = obj.swapNodes(head, k);
        list.traverse();
    }
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) return null;
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        for (int i = 1; i < k; i++) ptr1 = ptr1.next;
        ListNode first = ptr1;
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        int temp = first.val;
        first.val = ptr2.val;
        ptr2.val = temp;

        return head;
    }
}
