package Easy;

import java.util.Arrays;

public class Leetcode3467 {
    public static void main(String[] args) {
        Leetcode3467 obj = new Leetcode3467();
        int[] arr = new int[]{1, 5, 1, 4, 2};
        System.out.println(Arrays.toString(obj.transformArray(arr)));
    }

    public int[] transformArray(int[] nums) {
        int numberOfEvens = 0;
        for (int num : nums)
            if (num % 2 == 0)
                numberOfEvens++;
        for (int i = 0; i < nums.length; i++) {
            if (numberOfEvens != 0) {
                nums[i] = 0;
                numberOfEvens--;
            } else nums[i] = 1;
        }
        return nums;
    }
}
