package Easy;

import java.util.Arrays;

public class Leetcode455 {
    public static void main(String[] args) {
        Leetcode455 obj = new Leetcode455();
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(obj.findContentChildren(g,s));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
