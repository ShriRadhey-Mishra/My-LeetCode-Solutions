package Easy;

public class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;
        int first = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != first) {
                nums[index] = nums[i];
                first = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Leetcode26 obj = new Leetcode26();
        int[] num = { 1,1,2 };
        System.out.println(obj.removeDuplicates(num));
    }
}