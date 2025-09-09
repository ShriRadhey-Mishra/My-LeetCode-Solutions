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
        int count0 = 0, count1 = 0, count2 = 0;
        for (int number: nums) {
            if (number == 0) count0++;
            else if (number == 1) count1++;
            else count2++;
        }
        int index = 0;
        for (int i = 0; i < count0; i++) nums[index++] = 0;
        for (int i = 0; i < count1; i++) nums[index++] = 1;
        for (int i = 0; i < count2; i++) nums[index++] = 2;
    }
}
