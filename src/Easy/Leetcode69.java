package Leetcode.src.Easy;

public class Leetcode69 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int roundedSqrt = 0;
        for (int num = 1; num < x; num++) {
            if (num*num == x) {
                roundedSqrt = num;
                break;
            }
            else if ((num*num) <= x && (num*num) > roundedSqrt)
                roundedSqrt = num;
            else break;
        }
        return roundedSqrt;
    }

    public static void main(String[] args) {
        Leetcode69 obj = new Leetcode69();
        int x = 8;
        System.out.println(obj.mySqrt(x));
    }
}