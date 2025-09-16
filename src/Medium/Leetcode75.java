package Medium;

import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args) {
        Leetcode75 obj = new Leetcode75();
        int[] nums = { 2,0,2,1,1,0 };
        System.out.println(Arrays.toString(nums));
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[high];
                nums[high--] = nums[mid];
                nums[mid] = temp;
            }
        }
    }
}
