package Easy;

import java.util.HashMap;

public class Leetcode1512 {
    public static void main(String[] args) {
        Leetcode1512 obj = new Leetcode1512();
        int[] nums = new int[] {1,2,3,1,1,3};
        System.out.println(obj.numIdenticalPairs(nums));
    }
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int friend : nums) {
            int friendCount = hm.getOrDefault(friend, 0);
            ans += friendCount;
            hm.put(friend, friendCount + 1);
        }
        return ans;
    }
}
