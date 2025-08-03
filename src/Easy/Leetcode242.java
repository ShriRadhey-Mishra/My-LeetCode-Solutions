package Leetcode.src.Easy;

import java.util.*;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < sArr.length; i++)
            if (sArr[i]!= tArr[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Leetcode242 obj = new Leetcode242();
        String a = "silent";
        String b = "listen";
        System.out.println(obj.isAnagram(a,b));
    }
}