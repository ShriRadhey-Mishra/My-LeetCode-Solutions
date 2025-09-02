package Medium;

import java.util.*;

public class Leetcode54 {
    public static void main(String[] args) {
        Leetcode54 obj = new Leetcode54();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        List<Integer> spiralTraversal = obj.spiralOrder(matrix);
        System.out.println("Spiral Traversal: " + spiralTraversal);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;

        int up = 0, down = m - 1, left = 0, right = n - 1;

        while (list.size() < m * n) {
            // Traverse left -> right
            for (int i = left; i <= right && list.size() < m * n; i++) {
                list.add(matrix[up][i]);
            }
            up++;

            // Traverse top -> bottom
            for (int i = up; i <= down && list.size() < m * n; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse right -> left
            for (int i = right; i >= left && list.size() < m * n; i--) {
                list.add(matrix[down][i]);
            }
            down--;

            // Traverse bottom -> top
            for (int i = down; i >= up && list.size() < m * n; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
}
