package Medium;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {
    public static void main(String[] args) {
        Leetcode128 obj = new Leetcode128();
        int[] arr = {100,4,200,1,3,2};
        System.out.println(obj.longestConsecutive(arr));
    }
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int best = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int length = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }
}
