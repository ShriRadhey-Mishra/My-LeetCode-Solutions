package Easy;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        Leetcode1365 obj = new Leetcode1365();
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }
}
