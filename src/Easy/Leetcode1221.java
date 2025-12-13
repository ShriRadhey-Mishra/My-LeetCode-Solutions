package Easy;

public class Leetcode1221 {
    public static void main(String[] args) {
        Leetcode1221 obj = new Leetcode1221();
        String s = "RLRRRLLRLL";
        System.out.println(obj.balancedStringSplit(s));
    }

    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') r++;
            if (c == 'L') l++;
            if (r == l) count++;
        }
        return count;
    }
}
