package Easy;

import java.util.Arrays;

public class Leetcode338 {
    public static void main(String[] args) {
        Leetcode338 obj = new Leetcode338();
        int range = 5;
        System.out.println(Arrays.toString(obj.countBits(range)));
    }
    public int[] countBits(int n) {
        int[] output = new int[n+1];
        for (int i = 1; i <= n; i++) {
            output[i] = output[i >> 1] + (i & 1);
        }
        return output;
    }
}
