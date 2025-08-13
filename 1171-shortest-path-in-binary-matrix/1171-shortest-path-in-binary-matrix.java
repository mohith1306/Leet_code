import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        q.offer(new Pair(0, 0, 1));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            if (p.row == n-1 && p.col == n-1) return p.dist;

            for (int[] dir : directions) {
                int nr = p.row + dir[0];
                int nc = p.col + dir[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n &&
                    !visited[nr][nc] && grid[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.offer(new Pair(nr, nc, p.dist + 1));
                }
            }
        }
        return -1;
    }
}

class Pair {
    int row, col, dist;
    Pair(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}
