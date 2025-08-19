package Medium;

public class Leetcode142 {
    public static void main(String[] args) {
        Leetcode142 obj = new Leetcode142();
        ListNode list = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        list.next = list;
        System.out.println(obj.detectCycle(list));
    }
    public ListNode detectCycle(ListNode head) {
        ListNode start = head, fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                while (slow != start) {
                    slow = slow.next;
                    start = start.next;
                }
                return start;
            }
        }
        return null;
    }
}
