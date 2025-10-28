package Medium;

import java.util.Arrays;

public class Leetcode1143 {
    private int[][] dp;

    public static void main(String[] args) {
        Leetcode1143 obj = new Leetcode1143();
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(obj.longestCommonSubsequence(text1, text2));
    }

    private int findLCS(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) return 0;

        if (dp[i1][i2] != -1) return dp[i1][i2];
        if (s1.charAt(i1) == s2.charAt(i2))
            dp[i1][i2] = 1 + findLCS(s1, s2, i1 + 1, i2 + 1);
        else {
            int opt1 = findLCS(s1, s2, i1 + 1, i2);
            int opt2 = findLCS(s1, s2, i1, i2 + 1);
            dp[i1][i2] = Math.max(opt1, opt2);
        }

        return dp[i1][i2];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);
        return findLCS(text1, text2, 0, 0);
    }
}
