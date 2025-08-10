package Easy;

import java.util.*;

public class Leetcode67 {
    public String bitAddition(char a, char b, char carry) {
        int sum = (a-'0')+(b-'0')+(carry-'0');
        return switch (sum) {
            case 0 -> "00";
            case 1 -> "10";
            case 2 -> "01";
            case 3 -> "11";
            default -> throw new IllegalArgumentException("Invalid bit sum");
        };
    }

    public String addBinary(String a, String b) {
        if (Objects.equals(b, "0")) return a;
        if (Objects.equals(a, "0")) return b;

        StringBuilder result = new StringBuilder();
        char[] bigNumber = (a.length() >= b.length()) ? a.toCharArray() : b.toCharArray();
        char[] smallNumber = (a.length() >= b.length()) ? b.toCharArray() : a.toCharArray();
        int one = bigNumber.length-1;
        int two = smallNumber.length-1;
        char sumValue = '0';
        char carryValue = '0';
        String sumCarry = "";

        while (one >= 0 && two >= 0) {
            sumCarry = bitAddition(bigNumber[one], smallNumber[two], carryValue);
            sumValue = sumCarry.charAt(0);
            carryValue = sumCarry.charAt(1);
            result.append(sumValue);
            one--;
            two--;
            System.out.println(one + " " + two);
        }

        // System.out.println(result);

        while (!(one < 0)) {
            sumCarry = bitAddition(bigNumber[one], '0', carryValue);
            sumValue = sumCarry.charAt(0);
            carryValue = sumCarry.charAt(1);
            result.append(sumValue);
            one--;
        }

        // System.out.println(result);

        if (carryValue == '1') result.append(carryValue);

        // System.out.println(result);
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Leetcode67 obj = new Leetcode67();
        String a = "101";
        String b = "1";
        System.out.println(obj.addBinary(a,b));
    }
}