package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2194 {
    public static void main(String[] args) {
        Leetcode2194 obj = new Leetcode2194();
        String s = "K1:L2";
        System.out.println(obj.cellsInRange(s));
    }
    public List<String> cellsInRange(String s) {
        ArrayList<String> arr = new ArrayList<>();
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        int n1 = s.charAt(1) - '0';
        int n2 = s.charAt(4) - '0';
        for (char ch = c1; ch <= c2; ch++) {
            for (int i = n1; i <= n2; i++) {
                arr.add(String.valueOf(ch) + i);
            }
        }
        return arr;
    }
}
