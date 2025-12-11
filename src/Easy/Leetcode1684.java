package Easy;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1684 {
    public static void main(String[] args) {
        Leetcode1684 obj = new Leetcode1684();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(obj.countConsistentStrings(allowed, words));
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int bitset = 0;
        for (char c : allowed.toCharArray()) {
            bitset |= 1 << c - 'a';
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if ((bitset & (1 << c - 'a')) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
