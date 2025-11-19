package Easy;

public class Leetcode1290 {
    public static void main(String[] args) {
        Leetcode1290 obj = new Leetcode1290();
        ListNode list = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(obj.getDecimalValue(list));
    }
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) | head.val;
            head = head.next;
        }
        return num;
    }
}
