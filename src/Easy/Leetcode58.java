package Leetcode.src.Easy;

public class Leetcode58 {
    public int lengthOfLastWord(String s) {
        String a = s.stripTrailing();
        String[] b = a.split(" ");
        return b[b.length-1].length();
    }

    public static void main(String[] args) {
        Leetcode58 obj = new Leetcode58();
        String s = "Hello World";
        System.out.println(obj.lengthOfLastWord(s));
    }
}