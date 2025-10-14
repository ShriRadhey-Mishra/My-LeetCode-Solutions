package Medium;

import java.util.HashMap;

public class Leetcode198 {
    public static HashMap<Integer, Integer> dp = new HashMap<>();
    public static void main(String[] args) {
        int[] houses = { 6, 7, 1, 30, 8, 2, 4};
        System.out.println(rob(houses));
    }
    public static int houseRobber(int[] houses, int current) {
        if (current >= houses.length) return 0;
        if (!dp.containsKey(current)) {
            int stealFirst = houses[current] + houseRobber(houses, current+2);
            int skipFirst = houseRobber(houses, current+1);
            dp.put(current, Math.max(stealFirst, skipFirst));
        }
        return dp.get(current);
    }

    public static int rob(int[] nums) {
        dp.clear();
        return houseRobber(nums, 0);
    }
}
