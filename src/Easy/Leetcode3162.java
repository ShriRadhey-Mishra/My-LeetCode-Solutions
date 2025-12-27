package Easy;

public class Leetcode3162 {
    public static void main(String[] args) {
        Leetcode3162 obj = new Leetcode3162();
        int[] nums1 = {1,3,4};
        int[] nums2 = {1,3,4};
        int k = 1;
        System.out.println(obj.numberOfPairs(nums1, nums2, k));
    }
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int n: nums1)
            for (int m: nums2)
                if ( n % (m*k) == 0)
                    count++;
        return count;
    }
}
