package Easy;

public class Leetcode190 {
    public static void main(String[] args) {
        Leetcode190 obj = new Leetcode190();
        int n = 345678765;
        System.out.println(obj.reverseBits(n));
    }
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }
        return result;
    }
}
