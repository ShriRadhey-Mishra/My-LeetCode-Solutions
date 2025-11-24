package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Leetcode2824 {
    public static void main(String[] args) {
        Leetcode2824 obj = new Leetcode2824();
        List<Integer> list = new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        int target = 2;
        System.out.println(obj.countPairs(list, target));
    }
    public int countPairs(List<Integer> nums, int target) {
        int[] arr = new int[nums.size()];
        int pair = 0;

        for (int i = 0; i < nums.size(); i++) arr[i] = nums.get(i);
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] + arr[j] < target) pair++;

        return pair;
    }
}
