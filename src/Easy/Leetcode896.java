package Easy;

public class Leetcode896 {
    public static void main(String[] args) {
        Leetcode896 obj = new Leetcode896();
        int[] nums = {1, 5, 3, 4};
        System.out.println("Is Monotonic: " + obj.isMonotonic(nums));
    }
    public boolean isMonotonic(int[] nums) {
        boolean high = false;
        boolean low = false;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i+1]<nums[i]) low = true;
            else if (nums[i+1]>nums[i]) high = true;
        }
        return !high || !low;
    }
}
