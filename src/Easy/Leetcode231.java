package Easy;

public class Leetcode231 {
    public static void main(String[] args) {
        Leetcode231 obj = new Leetcode231();
        int n = 8;
        System.out.println(obj.isPowerOfTwo(n));
    }
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n-1)) == 0;
    }
}
