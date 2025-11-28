package Easy;

import java.util.Arrays;

public class Leetcode1920 {
    public static void main(String[] args) {
        Leetcode1920 obj = new Leetcode1920();
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(obj.buildArray(arr)));
    }
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
