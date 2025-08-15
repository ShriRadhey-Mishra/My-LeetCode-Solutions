package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode160 {
    public static void main(String[] args) {
        Leetcode160 obj = new Leetcode160();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, list1.next.next)));
        System.out.println(obj.getIntersectionNode(list1, list2));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode insersectingNode = null;
        HashSet<ListNode> list = new HashSet<>();
        ListNode curr = headA;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        curr = headB;
        while (curr != null) {
            if (list.contains(curr)) {
                insersectingNode = curr;
                break;
            }
            curr = curr.next;
        }
        return insersectingNode;
    }
}
