package Medium;

import java.util.HashSet;

public class Leetcode36 {
    public static void main(String[] args) {
        Leetcode36 obj = new Leetcode36();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Is this Sudoku valid: " + obj.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
//        if it's not a 9x9 board
        if (board.length != 9 || board[0].length != 9) return false;
//        checking if row is valid
        int rows = 0;
        while (rows < 9) {
            HashSet<Character> rhs = new HashSet<>();
            for (int column = 0; column < board[0].length; column++) {
                if (board[rows][column] == '.') continue;
                if (!rhs.add(board[rows][column])) return false;
            }
            rows++;
        }
//        checking if the column is valid
        int columns = 0;
        while (columns < 9) {
            HashSet<Character> chs = new HashSet<>();
            for (int row = 0; row < board.length; row++) {
                if (board[row][columns] == '.') continue;
                if (!chs.add(board[row][columns])) return false;
            }
            columns++;
        }
//        check if all the 9 boxes have unique elements
        if (!checkBox(board,0,2,0,2)) return false;
        if (!checkBox(board,3,5,0,2)) return false;
        if (!checkBox(board,6,8,0,2)) return false;
        if (!checkBox(board,0,2,3,5)) return false;
        if (!checkBox(board,3,5,3,5)) return false;
        if (!checkBox(board,6,8,3,5)) return false;
        if (!checkBox(board,0,2,6,8)) return false;
        if (!checkBox(board,3,5,6,8)) return false;
        if (!checkBox(board,6,8,6,8)) return false;

//        if valid for both the rows and columns as well as each box
        return true;
    }

    public boolean checkBox(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        HashSet<Character> hs = new HashSet<>();
        for (int row = rowStart; row < rowEnd+1; row++) {
            for (int column = colStart; column < colEnd+1; column++) {
                if (board[row][column] == '.') continue;
                if (!hs.add(board[row][column])) return false;
            }
        }
        return true;
    }

}
