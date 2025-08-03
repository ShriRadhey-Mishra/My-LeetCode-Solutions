package Leetcode.src.Easy;

import java.util.Arrays;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
       int[] sumIndices = new int[2];
        int n = nums.length;
        boolean completed = false;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j< nums.length; j++) {
                if(nums[i]+nums[j] == target) {
                    sumIndices[0] = i;
                    sumIndices[1] = j;
                    completed = true;
                    break;
                }
            }
            if (completed) break;

        }
        return sumIndices; 
    }

    public static void main(String[] args) {
        Leetcode1 obj = new Leetcode1();
        int[] num = { 2,7,11,15 };
        int target = 9;
        System.out.println(Arrays.toString(obj.twoSum(num, target)));
    }
}