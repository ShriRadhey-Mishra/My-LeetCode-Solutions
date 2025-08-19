package Medium;

public class Leetcode287 {
    public static void main(String[] args) {
        Leetcode287 obj = new Leetcode287();
        int[] arr = new int[]{1,3,4,2,4};
        System.out.println("Duplicate number is: " + obj.findDuplicate(arr));
    }
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
