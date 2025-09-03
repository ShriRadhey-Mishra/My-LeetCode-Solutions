package Medium;

import java.util.Arrays;

public class Leetcode59 {
    public static void main(String[] args) {
        Leetcode59 obj = new Leetcode59();
        int n = 9;
        int[][] nxnSpiralMatrix = obj.generateMatrix(n);
        System.out.println(Arrays.deepToString(nxnSpiralMatrix));
    }
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int up =0, left =0, right = n-1, down =n-1;
        for (int elem = 1; elem <= n*n;) {
            // left to right
            for (int i = left; i <= right; i++) {
                spiralMatrix[up][i] = elem;
                elem++;
            }
            up++;

            // up to down
            for (int i = up; i <= down; i++) {
                spiralMatrix[i][right] = elem;
                elem++;
            }
            right--;

            // right to left
            for (int i = right; i >= left; i--) {
                spiralMatrix[down][i] = elem;
                elem++;
            }
            down--;

            // down to up
            for (int i = down; i >= up; i--) {
                spiralMatrix[i][left] = elem;
                elem++;
            }
            left++;
        }
        return spiralMatrix;
    }
}
