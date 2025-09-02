package Medium;

import Easy.Leetcode867;

public class Leetcode540 {
    public static void main(String[] args) {
        Leetcode540 obj = new Leetcode540();
        int[] nums = {1,1,2,3,3,4,4,5,5};
        System.out.println(obj.singleNonDuplicate(nums));
    }
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int left = 0, right = nums.length -1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (mid %2 ==1) mid--;
            if (nums[mid] == nums[mid+1]) left = mid+2;
            else right = mid;
        }
        return nums[left];
    }
}
