package Easy;

public class Leetcode509 {
    public static void main(String[] args) {
        Leetcode509 obj = new Leetcode509();
        int n = 11;
        System.out.println(obj.fib(n));
    }
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n+1; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
