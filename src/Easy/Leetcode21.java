package Easy;

public class Leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode head = merged;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                merged.next = list1;
                list1 = list1.next;
            }
            else {
                merged.next = list2;
                list2 = list2.next;
            }
            merged =merged.next;
        }
        if (list1 == null) {
            merged.next = list2;
        } else {
            merged.next = list1;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Leetcode21 obj = new Leetcode21();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(obj.mergeTwoLists(list1,list2));
    }
}