package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode136 {
    public static void main(String[] args) {
        Leetcode136 obj = new Leetcode136();
        int[] array = { 4, 1, 2, 1, 2 };
        System.out.println(obj.singleNumber(array));
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num: nums) {
            if (!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num)+1);
            }
        }
        int singleNum = 0;
        for (int field: hm.keySet()) {
            if (hm.get(field) == 1) {
                singleNum = field;
                break;
            }
        }
        return singleNum;
    }
}
