package Easy;

public class Leetcode3498 {
    public static void main(String[] args) {
        Leetcode3498 obj = new Leetcode3498();
        String s = "abc";
        System.out.println(obj.reverseDegree(s));
    }

    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) res += ('z' - s.charAt(i) + 1) * (i + 1);
        return res;
    }
}
