package Easy;

public class Leetcode191 {
    public static void main(String[] args) {
        Leetcode191 obj = new Leetcode191();
        int n = 20;
        System.out.println(obj.hammingWeight(n));
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if ((n&1)==1) count++;
            n >>= 1;
        }
        return count;
    }
}
