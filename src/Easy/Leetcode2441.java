package Easy;
import java.util.HashSet;

public class Leetcode2441 {
    public static void main(String[] args) {
        Leetcode2441 obj = new Leetcode2441();
        int[] nums = {3,2,-2,5,-3};
        System.out.println(obj.findMaxK(nums));
    }
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num: nums) hs.add(num);
        int result = -1;
        for (int num: nums) {
            if (hs.contains(-num) && num > result)
                result = num;
        }
        return result;
    }
}