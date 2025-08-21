class Tuple {
    int dist;
    int row;
    int col;

    Tuple(int dist, int row, int col) {
        this.dist = dist;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int columns = heights[0].length;
        int[][] distance = new int[heights.length][heights[0].length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                distance[i][j] = (int) (1e9);
            }
        }
        distance[0][0] = 0;
        PriorityQueue<Tuple> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.dist, y.dist));

        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        pq.add(new Tuple(0, 0, 0));
        while (!pq.isEmpty()) {
            Tuple t = pq.poll();
            int d = t.dist;
            int row = t.row;
            int col = t.col;
            if (row == rows - 1 && col == columns - 1)
                return d;
            for (int i = 0; i < 4; i++) {
                int newRow = dr[i] + row;
                int newCol = dc[i] + col;
                if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < columns) {
                    int effort = Math.max(Math.abs(heights[row][col] - heights[newRow][newCol]), d);
                    if (effort < distance[newRow][newCol]) {
                        distance[newRow][newCol] = effort;
                        pq.add(new Tuple(effort,newRow, newCol));
                    }
                }
            }
        }
        return 0;
    }
}