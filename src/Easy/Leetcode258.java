package Easy;

public class Leetcode258 {
    public static void main(String[] args) {
        Leetcode258 obj = new Leetcode258();
        int num = 38;
        System.out.println(obj.addDigits(num));
    }

    public int addDigits(int num) {
        if (num < 10) return num;
        else {
            if (num % 9 == 0) return 9;
            else return num % 9;        // digital sum follows a pattern where digital sum of all the numbers divisible by 9 is 9 and for the remaining numbers, it is the remainder of when that number is divided by 9.
        }
    }
}
