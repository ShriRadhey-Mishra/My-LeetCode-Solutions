package Medium;

import java.util.*;

public class Leetcode2785 {
    public static void main(String[] args) {
        Leetcode2785 obj = new Leetcode2785();
        String s = "lEetcOde";
        System.out.println(s);
        System.out.println(obj.sortVowels(s));
    }

    public String sortVowels(String s) {
        char[] cArr = s.toCharArray();
        char[] output = new char[s.length()];
        Set<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        int numberOfVowel = 0;
        for (char c: cArr) {
            if (hs.contains(c))
                numberOfVowel++;
        }

        char[] vowel = new char[numberOfVowel];
        int[] index = new int[numberOfVowel];
        int a = 0;

        for (int i = 0; i < cArr.length; i++) {
            if (hs.contains(cArr[i])) {
                vowel[a] = cArr[i];
                index[a++] = i;
            }
            else output[i] = cArr[i];
        }

        Arrays.sort(vowel);
        a = 0;
        for (char v: vowel) {
            output[index[a++]] = v;
        }

        return new String(output);
    }
}
