package Medium;

import java.util.Arrays;
import java.util.List;

public class Leetcode120 {
    private int[][] dp;

    public static void main(String[] args) {
        Leetcode120 obj = new Leetcode120();
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(obj.minimumTotal(triangle));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        return dfs(0, 0, triangle, n);
    }

    private int dfs(int row, int col, List<List<Integer>> triangle, int n) {
        if (row == n - 1) return triangle.get(row).get(col);

        if (dp[row][col] != Integer.MIN_VALUE) return dp[row][col];

        int down = dfs(row + 1, col, triangle, n);
        int downRight = dfs(row + 1, col + 1, triangle, n);

        dp[row][col] = triangle.get(row).get(col) + Math.min(down, downRight);
        return dp[row][col];
    }
}
