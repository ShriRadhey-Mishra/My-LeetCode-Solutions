package Medium;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        Leetcode34 obj = new Leetcode34();
        int[] input = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] firstAndLastPositionOfTarget = obj.searchRange(input, target);
        System.out.println(Arrays.toString(firstAndLastPositionOfTarget));
    }

    public int[] searchRange(int[] nums, int target) {
        int output0 = -1, output1 = -1;

//        finding the first occurrence
        int first = 0, last = nums.length - 1;
        while (first <= last) {
            // effectively we close down the array towards the first occurrence
            int mid = first + (last - first) / 2;       // calculate the mid-index
            if (nums[mid] >= target)
                last = mid - 1;    // if the value of mid-index is greater than or equal to the target value we, move the last pointer by mid - 1.
            else first = mid + 1;                       // else we just move the first by mid + 1
            if (nums[mid] == target) output0 = mid;     // for the case where the mid-index value is the target
        }

//        finding the last occurrence
        // reset the value for first and the last pointer again
        first = 0;
        last = nums.length - 1;
        while (first <= last) {
            // here we close down the array towards the last occurrence
            int mid = first + (last - first) / 2;       // calculate the mid-index
            if (nums[mid] <= target)
                first = mid + 1;   // If the mid-index value is less than or equal to the target value we move the first pointer to mid +1
            else
                last = mid - 1;                        // else if the value of mid-index is greater than the target value, we move the last pointer to mid - 1
            if (nums[mid] == target) output1 = mid;    // for the case where the mid-index value is the target
        }
        return new int[]{output0, output1};
    }
}
