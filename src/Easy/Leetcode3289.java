package Easy;

import java.util.Arrays;

public class Leetcode3289 {
    public static void main(String[] args) {
        Leetcode3289 obj = new Leetcode3289();
        int[] arr = {0,3,2,1,3,2};
        System.out.println(Arrays.toString(obj.getSneakyNumbers(arr)));
    }
    public int[] getSneakyNumbers(int[] nums) {
        int xor = 0;
        int n = nums.length - 2;

        for (int num : nums) xor ^= num;
        for (int i = 0; i < n; i++) xor ^= i;

        int diffBit = xor & -xor;

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) a ^= num;
            else b ^= num;
        }
        for (int i = 0; i < n; i++) {
            if ((i & diffBit) == 0) a ^= i;
            else b ^= i;
        }

        return new int[]{a, b};
    }
}
