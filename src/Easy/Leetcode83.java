package Easy;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

    public void traverse() {
        ListNode1 curr = this;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Leetcode83 {
    public static void main(String[] args) {
        Leetcode83 obj = new Leetcode83();
        ListNode1 list = new ListNode1(1, new ListNode1(1, new ListNode1(2, new ListNode1(3))));
        ListNode1 setList = obj.deleteDuplicates(list);
    }

    public ListNode1 deleteDuplicates(ListNode1 head) {
        ListNode1 newHead = head;
        while (newHead != null && newHead.next != null) {
            if (newHead.val == newHead.next.val) {
                newHead.next = newHead.next.next;
            } else {
                newHead = newHead.next;
            }
        }
//        head.traverse();
        return head;
    }
}
