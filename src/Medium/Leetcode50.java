package Medium;

public class Leetcode50 {
    public static void main(String[] args) {
        Leetcode50 obj = new Leetcode50();
        System.out.println(obj.myPow(2, 3));
    }

    public double myPow(double x, int n) {
//        return Math.pow(x, n);

//        if (n == 0) return 1;
//        if (x == 1) return 1;
//        if (x == -1) return (n % 2 == 0) ? 1 : -1;
//        if (x == 0) return 0;
//        if (n == Integer.MAX_VALUE || n == Integer.MIN_VALUE) return 0;
//        double solution = 1;
//
//        if (n > 0) {
//            for (int i = 0; i < n; i++)
//                solution *= x;
//        } else {
//            for (int i = 0; i < Math.abs(n); i++)
//                solution /= x;
//        }
//
//        return solution;
//    }

        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        double result = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                result *= x;
            }
            x *= x;
            n>>>=1;
        }
        return result;
    }
}
