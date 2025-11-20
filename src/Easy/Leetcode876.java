package Easy;

public class Leetcode876 {
    public static void main(String[] args) {
        Leetcode876 obj = new Leetcode876();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        node.traverse();
        ListNode mid = obj.middleNode(node);
        mid.traverse();
    }
    public ListNode middleNode(ListNode head) {
        ListNode dumdum = head;
        int length = 0;
        while (dumdum != null) {
            length+=1;
            dumdum = dumdum.next;
        }
        int middle = length /2;
        for (int i = 0; i < middle; i++) head = head.next;
        return head;
    }
}
