public class Main {

    public static boolean isSafe(char[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (i = row, j = col; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static int nQueen(char[][] board, int col) {
        int count = 0;
        if(col == board.length){
            return 1;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += nQueen(board, col + 1);
                board[row][col] = '.';
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        System.out.println(nQueen(board, 0));
    }
}