package Easy;

import java.util.*;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        try {
            while (fast != null || fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode141 obj = new Leetcode141();
        ListNode list = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        list.next = list;
        System.out.println(obj.hasCycle(list));
    }
}
