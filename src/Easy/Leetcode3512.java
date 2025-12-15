package Easy;

public class Leetcode3512 {
    public static void main(String[] args) {
        Leetcode3512 obj = new Leetcode3512();
        int[] nums = {3,9,7};
        int k = 5;
        System.out.println(obj.minOperations(nums, k));
    }
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num: nums) sum += num;
        return sum % k;
    }
}
