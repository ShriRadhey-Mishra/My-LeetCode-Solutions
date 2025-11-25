package Easy;

import java.util.HashMap;

public class Leetcode3541 {
    public static void main(String[] args) {
        Leetcode3541 obj = new Leetcode3541();
        String s = "success";
        System.out.println(obj.maxFreqSum(s));
    }
    public int maxFreqSum(String s) {
        int vowel = 0, consonent = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch: s.toCharArray()) {
            if (hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
            else hm.put(ch, 1);
        }
        for (char ch: hm.keySet()) {
            int freq = hm.get(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (freq > vowel) vowel = freq;
            }
            else {
                if (freq > consonent) consonent = freq;
            }
        }
        return vowel+consonent;
    }
}
