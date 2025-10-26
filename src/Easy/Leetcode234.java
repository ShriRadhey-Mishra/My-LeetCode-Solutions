package Easy;

public class Leetcode234 {
    public static void main(String[] args) {
        Leetcode234 obj = new Leetcode234();
        ListNode ll = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(obj.isPalindrome(ll));
    }
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        String s = sb.toString();
        for  (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))  return false;
        }
        return true;
    }
}
