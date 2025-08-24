package Medium;

import java.util.Arrays;

public class Leetcode537 {
    public static void main(String[] args) {
        Leetcode537 obj = new Leetcode537();
        String num1 = "78+-76i";
        String num2 = "-86+72i";
        String num1_num2 = obj.complexNumberMultiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + num1_num2);
    }

    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder output = new StringBuilder();

        String[] nums1 = num1.split("\\+");
        String[] nums2 = num2.split("\\+");

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int a = Integer.parseInt(nums1[0]);
        int b = Integer.parseInt(nums1[1].replace("i", ""));
        int c = Integer.parseInt(nums2[0]);
        int d = Integer.parseInt(nums2[1].replace("i", ""));

        int realOutput = (a * c) - (b * d);
        int imaginaryOutput = (a * d) + (b * c);
        output.append(realOutput);
        output.append("+");
        output.append(imaginaryOutput);
        output.append("i");

        return output.toString();
    }
}
