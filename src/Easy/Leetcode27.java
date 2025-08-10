package Easy;

public class Leetcode27 {

    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1;
        int i = 0;

        while (i <= right) {
            if (nums[i] == val) {
                nums[i] = nums[right];
                right--;
            } else {
                i++;
            }
        }

        return right + 1;
    }

    public static void main(String[] args) {
        Leetcode27 obj = new Leetcode27();
        int[] nums = { 3,2,2,3 };
        int val = 3;
        System.out.println(obj.removeElement(nums,val));
    }
}
