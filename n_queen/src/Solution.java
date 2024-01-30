import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static boolean isSafe(int row, int col, char[][] board) {
        int i, j;
        //row wise
        for (i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        //column wise
        for (i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //upper left
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //upper right
        for (i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //lower left
        for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //lower right
        for (i = row, j = col; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoards(List<List<String>> allBoards, char[][] board) {
        String row;
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void nQueen(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoards(allBoards, board);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                nQueen(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        nQueen(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        solveNQueens(4).forEach(innerList -> {
            String line = String.join(", ", innerList);
            System.out.println(line);
        });
    }
}