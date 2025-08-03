package Medium;

import java.util.Arrays;

public class Leetcode48 {
    public void rotate(int[][] matrix) {
        if (matrix.length == matrix[0].length) {
            //  swap along diagonal
            for(int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < row; column++) {
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[column][row];
                    matrix[column][row] = temp;
                }
            }
            //  swap along vertical
            int n = matrix.length % 2 == 0 ? matrix.length/2 : (matrix.length+1)/2;
            for(int row = 0; row < matrix.length; row++) {
                for(int column = 0; column<n; column++) {
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[row][matrix[0].length-column-1];
                    matrix[row][matrix[0].length-column-1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        Leetcode48 obj = new Leetcode48();
        int[][] twoDArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        obj.rotate(twoDArray);
        System.out.println(Arrays.deepToString(twoDArray));
    }
}