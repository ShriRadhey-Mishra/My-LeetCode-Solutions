package Easy;

import java.util.*;

public class Leetcode349 {
    public static void main(String[] args) {
        Leetcode349 obj = new Leetcode349();
        int[] arr1 = { 1,2,2,1 };
        int[] arr2 = { 2,2 };
        System.out.println(Arrays.toString(obj.intersection(arr1, arr2)));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        for (int num: nums1) {
            hs1.add(num);
        }

        for (int num: nums2) {
            if (!hs1.add(num)) hs2.add(num);
        }

        int[] result = new int[hs2.size()];
        int index = 0;
        for (int num: hs2) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
