package Medium;

import java.util.HashMap;

public class Leetcode12 {
    public static void main(String[] args) {
        Leetcode12 obj = new Leetcode12();
        int num = 3749;
        System.out.println(num + ": " + obj.intToRoman(num));
    }

    public String intToRoman(int num) {
        HashMap<Integer, Character> hm = new HashMap<>();
        hm.put(1, 'I');
        hm.put(5, 'V');
        hm.put(10, 'X');
        hm.put(50, 'L');
        hm.put(100, 'C');
        hm.put(500, 'D');
        hm.put(1000, 'M');

        StringBuilder sb = new StringBuilder();
        int pos = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 5) {
                sb.append(hm.get(digit*pos));
            } else if (digit == 4 || digit == 9) {
                sb.append(hm.get((digit+1)*pos));
                sb.append(hm.get(pos));
            } else {
                boolean isGreaterThanFive = digit > 5;
                if (isGreaterThanFive) digit -= 5;
                for (int i = 0; i < digit; i++) sb.append(hm.get(pos));
                if (isGreaterThanFive) sb.append(hm.get(5*pos));
            }
            num /= 10;
            pos *= 10;
        }
        return sb.reverse().toString();
    }
}
