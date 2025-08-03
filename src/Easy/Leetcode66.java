package Leetcode.src.Easy;

import java.util.Arrays;

public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length-1;
        int toAdd = digits[lastIndex];
        toAdd += 1;
        if (toAdd == 10 && digits.length > 1) {
            digits[lastIndex] = 0;
            while (lastIndex>1 && digits[lastIndex-1]==9){
                digits[lastIndex-1] = 0;
                lastIndex--;
            }
            digits[lastIndex-1] += 1;
        }
        else {
            digits[lastIndex] = toAdd;
        }

        if(digits[0] == 10) {
            int[] newArr = new int[digits.length+1];
            newArr[0] = 1;
            System.arraycopy(digits, 1, newArr, 1, digits.length - 1);
            return newArr;
        }

        return digits;
    }

    public static void main(String[] args) {
        Leetcode66 obj = new Leetcode66();
        int[] num = { 1,2,3 };
        System.out.println(Arrays.toString(obj.plusOne(num)));
    }
}