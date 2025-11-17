package Easy;

public class Leetcode3701 {
    public static void main(String[] args) {
        Leetcode3701 obj = new Leetcode3701();
        int[] arr = {1,3,5,7};
        System.out.println(obj.alternatingSum(arr));

    }
    public int alternatingSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i+=2) res += nums[i];
        for (int j = 1; j < nums.length; j+=2) res -= nums[j];
        return res;
    }
}
