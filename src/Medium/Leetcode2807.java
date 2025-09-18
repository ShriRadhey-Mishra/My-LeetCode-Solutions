package Medium;

public class Leetcode2807 {
    public static void main(String[] args) {
        Leetcode2807 obj = new Leetcode2807();
        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));
        head.traverse();
        ListNode gcdInserted = obj.insertGreatestCommonDivisors(head);
        gcdInserted.traverse();
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
            int k = gcd(first.val, second.val);
            second = second.next;
            ListNode newNode = new ListNode(k);
            newNode.next = first.next;
            first.next = newNode;
            first = first.next.next;
        }
        return head;
    }
}
