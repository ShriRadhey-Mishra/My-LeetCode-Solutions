package Medium;

public class Leetcode1669 {
    public static void main(String[] args) {
        Leetcode1669 obj = new Leetcode1669();
        ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5))))));
        int a = 3;
        int b = 4;
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
        list1.traverse();
        System.out.println(a+"\n"+b);
        list2.traverse();
        ListNode merged = obj.mergeInBetween(list1, a, b, list2);
        merged.traverse();
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode headB = list1;
        for (int i = 0; i < a-1; i++) head = head.next;
        for (int i = 0; i < b+1; i++) headB = headB.next;
        head.next = list2;
        while (head.next != null) head = head.next;
        head.next = headB;
        return list1;
    }
}
