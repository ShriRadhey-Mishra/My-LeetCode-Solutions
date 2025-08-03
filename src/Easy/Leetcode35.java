package Leetcode.src.Easy;

public class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int num : nums)
            if (num > target || num == target)
                break;
            else index++;
        return index;
    }

    public static void main(String[] args) {
        Leetcode35 obj = new Leetcode35();
        int[] nums = { 1,3,5,6 };
        int target = 5;
        System.out.println(obj.searchInsert(nums, target));
    }
}