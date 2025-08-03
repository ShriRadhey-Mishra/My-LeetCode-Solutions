package Medium;

import java.util.*;

public class Leetcode8 {
    public int myAtoi(String s) {
        char[] digits = s.trim().toCharArray();
        if (digits.length == 0) return 0;
        StringBuilder number = new StringBuilder();
        int sign = 1;
        int index = 0;

        if (digits[0] == '-') {
            if (digits.length > 1) {
                sign = -1;
                index++;
            } else return 0;
        }
        if (digits[0] == '+') {
            if (digits.length > 1) index++;
            else return 0;
        }
        try {
            while (digits[index] == '0') index++;
        } catch (Exception e) {
            return 0;
        }
        
        for (int i = index; i < digits.length; i++) {
            if(Character.isDigit(digits[i])) {
                number.append(digits[i]);
            } else break;
        }
        String newS = number.toString();
        if (Objects.equals(newS, "")) return 0;
        if(String.valueOf(Integer.MAX_VALUE).length() >= newS.length()) {
            if (Long.parseLong(String.valueOf(Integer.MAX_VALUE)) < Long.parseLong(newS))
                if (sign < 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
        }else {
            if (sign > 0) return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(newS) * sign;
    }

    public static void main(String[] args) {
        Leetcode8 obj = new Leetcode8();
        String s = "   -042";
        System.out.println(obj.myAtoi(s));
    }
}