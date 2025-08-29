package Easy;

import java.util.Arrays;

public class Leetcode344 {
    public static void main(String[] args) {
        Leetcode344 obj = new Leetcode344();
        char[] charArr = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(charArr));
        obj.reverseString(charArr);
        System.out.println(Arrays.toString(charArr));
    }
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            int other = s.length-i-1;
            char temp = s[i];
            s[i] = s[other];
            s[other] = temp;
        }
    }
}
