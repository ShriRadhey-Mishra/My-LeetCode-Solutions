package Easy;

public class Leetcode3190 {
    public static void main(String[] args) {
        Leetcode3190 obj = new Leetcode3190();
        int[] nums = {1,2,3,4};
        System.out.println(obj.minimumOperations(nums));
    }
    public int minimumOperations(int[] nums) {
        int ret = 0;
        for (int num : nums)
            if (num % 3 != 0)
                ret++;
        return ret;
    }
}
