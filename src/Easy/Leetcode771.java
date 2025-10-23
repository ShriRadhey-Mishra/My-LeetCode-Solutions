package Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode771 {
    public static void main(String[] args) {
        Leetcode771 obj = new Leetcode771();
        String jewels = "aA";
        String stones = "aAAbBc";
        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch: stones.toCharArray()) {
            if (!hm.containsKey(ch)) hm.put(ch, 1);
            else hm.put(ch, hm.get(ch)+1);
        }
        int num = 0;
        for (char ch: jewels.toCharArray()){
            if (hm.containsKey(ch)) num += hm.get(ch);
        }
        return num;
    }
}
