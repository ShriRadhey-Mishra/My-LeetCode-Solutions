package Easy;

public class Leetcode3114 {
    public static void main(String[] args) {
        Leetcode3114 obj = new Leetcode3114();
        String s = "1?:5?";
        System.out.println(obj.findLatestTime(s));
    }
    public String findLatestTime(String s) {
        char[] a = s.toCharArray();
        if (a[0] == '?') {
            if (a[1] == '?' || a[1] <= '1') a[0] = '1';
            else a[0] = '0';
        }
        if (a[1] == '?') {
            a[1] = (a[0] == '1') ? '1' : '9';
        }
        if (a[3] == '?') a[3] = '5';
        if (a[4] == '?') a[4] = '9';
        return new String(a);
    }
}
