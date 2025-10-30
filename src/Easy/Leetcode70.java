package Easy;

public class Leetcode70 {
    public static void main(String[] args) {
        Leetcode70 obj = new Leetcode70();
        int n = 5;
        System.out.println(obj.climbStairs(n));
    }
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
