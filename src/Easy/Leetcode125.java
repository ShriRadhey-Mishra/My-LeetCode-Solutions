package Leetcode.src.Easy;

import java.util.*;

public class Leetcode125 {
    public boolean isAlpha (char c) {
        return Character.isLetterOrDigit(c);
    }
    public boolean isPalindrome(String s) {
        if (Objects.equals(s, " ")) return true;
        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i <s.length(); i++)
            if (isAlpha(s.charAt(i))) sb.append((s.charAt(i)));
        for (int i = sb.length()-1; i >= 0; i--)
            reversed.append(sb.charAt(i));
        String a = sb.toString().toLowerCase();
        String b = reversed.toString().toLowerCase();
        return Objects.equals(a, b);
    }
    public static void main(String[] args) {
        Leetcode125 obj =new Leetcode125();
        String s = "naman";
        System.out.println(obj.isPalindrome(s));
    }
}