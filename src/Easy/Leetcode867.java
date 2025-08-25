package Easy;

import java.util.Arrays;

public class Leetcode867 {
    public static void main(String[] args) {
        Leetcode867 obj = new Leetcode867();
        int[][] matrix = {{1,2},{3,4},{5,6}};
        int[][] transposeMatrix = obj.transpose(matrix);
        System.out.println(Arrays.deepToString(transposeMatrix));
    }
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length, columns = matrix[0].length;
        int[][] transPose = new int[columns][rows];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transPose[column][row] = matrix[row][column];
            }
        }
        return transPose;
    }
}
