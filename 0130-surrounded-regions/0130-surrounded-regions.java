class Solution {
    public void dfs(int i, int j, char[][] board, boolean[][] visited, int delrow[], int delcol[], int n, int m) {
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int newRow = i + delrow[k];
            int newCol = j + delcol[k];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && !visited[newRow][newCol] && board[newRow][newCol] == 'O') {
                dfs(newRow, newCol, board, visited, delrow, delcol, n, m);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O' && !visited[0][i]) {
                dfs(0, i, board, visited, delrow, delcol, n, m);
            }
            if (board[n - 1][i] == 'O' && !visited[n - 1][i]) {
                dfs(n - 1, i, board, visited, delrow, delcol, n, m);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) {
                dfs(i, 0, board, visited, delrow, delcol, n, m);
            }
            if (board[i][m - 1] == 'O' && !visited[i][m - 1]) {
                dfs(i, m - 1, board, visited, delrow, delcol, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
