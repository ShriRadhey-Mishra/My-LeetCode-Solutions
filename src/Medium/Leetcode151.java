package Medium;

import java.util.Arrays;

public class Leetcode151 {
    public static void main(String[] args) {
        Leetcode151 obj = new Leetcode151();
        String s = "          SKAI is  your    GOD     ";
        System.out.println(obj.reverseWords(s));
    }
    public String reverseWords(String s) {
        String[] str = s.strip().split(" ");
        StringBuilder sb = new StringBuilder();
        int left = 0, right = str.length-1;
        while (left < right) {
            String temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isBlank()) {
                sb.append(str[i]);
                if (i != str.length-1) sb.append(" ");
            }
        }
        return sb.toString();
    }
}
