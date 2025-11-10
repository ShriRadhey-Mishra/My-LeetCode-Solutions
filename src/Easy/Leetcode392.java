package Easy;

public class Leetcode392 {
    public static void main(String[] args) {
        Leetcode392 obj = new Leetcode392();
        String a = "abc";
        String b = "ahbgdc";
        System.out.println(obj.isSubsequence(a, b));
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == n;
    }
}
