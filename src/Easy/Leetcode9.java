package Easy;

public class Leetcode9 {
    public boolean isPalindrome(int x) {
        if (x < 0)  return false;
        int reversed = 0;
        int n = x;
        while (n > 0) {
            int d = n % 10;
            reversed = reversed*10 + d;
            n /= 10;
        }
        if (reversed == x) return true;
        return false;
    }

    public static void main(String[] args) {
        Leetcode9 obj = new Leetcode9();
        int num = 121;
        System.out.println(obj.isPalindrome(num));
    }
}