public class Game_Of_Life_289 {
    class Solution {
        public void gameOfLife(int[][] board) {
            int[][] directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int neighbours = 0;
                    for (int[] direction : directions) {
                        int row = i + direction[0];
                        int col = j + direction[1];
                        if (row < 0 || row >= m || col < 0 || col >= n
                                || board[row][col] == 0 || board[row][col] == 2) {
                            continue;
                        }
                        neighbours++;
                    }
                    if (board[i][j] == 1 && (neighbours < 2 || neighbours > 3)) {
                        board[i][j] = 10;
                    } else if (board[i][j] == 0 && neighbours == 3) {
                        board[i][j] = 2;
                    }
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 10) {
                        board[i][j] = 0;
                    } else if (board[i][j] == 2) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
