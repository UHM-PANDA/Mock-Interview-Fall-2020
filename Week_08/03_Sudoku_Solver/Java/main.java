public class Main {
     public void solveSudoku(char[][] board) {
         helper(board);
     }

     private boolean helper(char[][] board) {
         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                 if (board[i][j] != '.') {
                     continue;
                 }

                 for (char k = '1'; k <= '9'; k++) {
                     if (isValid(board, i, j, k)) {
                         board[i][j] = k;
                         if (helper(board)) {
                             return true;
                         }
                         board[i][j] = '.';
                     }
                 }
                 return false;
             }
         }

         return true; //return true if all cells are checked
     }

     private boolean isValid(char[][] board, int row, int col, char c) {
         for (int i = 0; i < 9; i++) {
             if (board[i][col] != '.' && board[i][col] == c) {
                 return false;
             }

             if (board[row][i] != '.' && board[row][i] == c) {
                 return false;
             }

             if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                     &&
                     board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                 return false;
             }
         }
         return true;
     }
}
