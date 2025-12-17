package Easy;

import java.util.Arrays;

public class Leetcode2574 {
    public static void main(String[] args) {
        Leetcode2574 obj = new Leetcode2574();
        int[] arr = {10,4,8,3};
        System.out.println(Arrays.toString(obj.leftRightDifference(arr)));
    }
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefixSum = 0, leftSum = 0, rightSum = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        for(int i = 0; i < n; i++){
            leftSum = prefixSum;
            prefixSum += nums[i];
            rightSum = sum - prefixSum;

            result[i] = Math.abs(leftSum - rightSum);
        }

        return result;
    }
}
