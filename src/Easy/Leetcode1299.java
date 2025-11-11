package Easy;

import java.util.Arrays;

public class Leetcode1299 {
    public static void main(String[] args) {
        Leetcode1299 obj = new Leetcode1299();
        int[] arr = { 17,18,5,4,6,1 };
        System.out.println(Arrays.toString(obj.replaceElements(arr)));
    }

    public int[] replaceElements(int[] arr) {
        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, temp);
        }

        return arr;
    }
}
