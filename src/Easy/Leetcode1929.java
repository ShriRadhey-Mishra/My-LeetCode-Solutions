package Easy;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        Leetcode1929 obj = new Leetcode1929();
        int[] arr = {1,2,3,1};
        System.out.println(Arrays.toString(obj.getConcatenation(arr)));
    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
}
