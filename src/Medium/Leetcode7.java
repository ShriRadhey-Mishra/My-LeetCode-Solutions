package Medium;

public class Leetcode7 {
    public static void main(String[] args) {
        Leetcode7 obj = new Leetcode7();
        int num = 123;
        System.out.println(obj.reverse(num));
    }
    public int reverse(int x) {
        long sign = 1;
        if (x < 0) {
            x *= -1;
            sign = -1;
        }
        long reversed = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x /= 10;
        }
        if (reversed >= Integer.MAX_VALUE || reversed <= Integer.MIN_VALUE) return 0;
        return  Integer.parseInt(String.valueOf(reversed * sign));
    }
}
