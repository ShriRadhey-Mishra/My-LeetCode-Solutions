package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1790 {
    public static void main(String[] args) {
        Leetcode1790 obj = new Leetcode1790();
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(obj.areAlmostEqual(s1,s2));
    }
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) list.add(i);
            if (list.size() > 2) return false;
        }
        return list.isEmpty() || (list.size() == 2
                && s1.charAt(list.get(0)) == s2.charAt(list.get(1))
                && s1.charAt(list.get(1)) == s2.charAt(list.get(0)));
    }
}
