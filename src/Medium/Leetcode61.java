package Medium;

public class Leetcode61 {
    public static void main(String[] args) {
        Leetcode61 obj = new Leetcode61();
        ListNode ll = new ListNode(1, new ListNode(2, new ListNode(3)));
        int k = 4;
        ll.traverse();
        ListNode rotated = obj.rotateRight(ll, k);
        rotated.traverse();
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode tail = head;
        int count = 1;
        while (tail.next!=null) {
            count++;
            tail = tail.next;
        }

        k %= count;


        for (int i = 0; i < k; i++) {
            ListNode ptr = head;
            while (ptr != tail) {
                int temp = ptr.val;
                ptr.val = tail.val;
                tail.val = temp;
                ptr = ptr.next;
            }
        }

        return head;
    }
}
