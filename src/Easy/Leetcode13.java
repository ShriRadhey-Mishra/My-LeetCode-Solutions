package Leetcode.src.Easy;

import java.util.HashMap;

public class Leetcode13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i+1<=s.length()-1) {
                if (hm.get(s.charAt(i + 1)) > hm.get(s.charAt(i))) {
                    total += hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i));
                    i++;
                }
                else {
                    total += hm.get(s.charAt(i));
                }
            }
            else {
                total += hm.get(s.charAt(i));
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Leetcode13 obj = new Leetcode13();
        String s = "III";
        System.out.println(obj.romanToInt(s));
    }
}