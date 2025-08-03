package Leetcode.src.Easy;

import java.util.*;

public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>(nums.length);
        for (int num: nums) {
            if (!hs.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode217 obj = new Leetcode217();
        int[] nums = { 1,2,3,1 };
        System.out.println(obj.containsDuplicate(nums));
    }
}