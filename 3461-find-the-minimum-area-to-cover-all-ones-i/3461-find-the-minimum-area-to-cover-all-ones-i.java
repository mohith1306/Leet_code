class Solution {
    public int minimumArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int firstRow = Integer.MAX_VALUE, lastRow = -1;
        int firstCol = Integer.MAX_VALUE, lastCol = -1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (firstRow == Integer.MAX_VALUE) {
                        firstRow = i;
                    }
                    lastRow = i;
                    break;
                }
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (grid[i][j] == 1) {
                    if (firstCol == Integer.MAX_VALUE) {
                        firstCol = j;
                    }
                    lastCol = j;
                    break;
                }
            }
        }

        if (firstRow == Integer.MAX_VALUE) return 0; 

        return (lastRow - firstRow + 1) * (lastCol - firstCol + 1);
    }
}
