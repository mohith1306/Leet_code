class Solution {
    public int dfs(int[][] grid, int r, int c, boolean[][] visited, int[] dr, int[] dc, int count, int row, int col) {
        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int newRow = r + dr[i];
            int newCol = c + dc[i];

            if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col) {
                if (grid[newRow][newCol] != 0 && !visited[newRow][newCol]) {
                    count = dfs(grid, newRow, newCol, visited, dr, dc, count + grid[newRow][newCol], row, col);
                }
            }
        }
        return count;
    }

    public int countIslands(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int finalAns = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    int ans = dfs(grid, i, j, visited, dr, dc, grid[i][j], row, col);
                    if (ans % k == 0) {
                        finalAns++;
                    }
                }
            }
        }
        return finalAns;
    }
}
