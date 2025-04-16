class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        Queue<int []> queue = new LinkedList<>();
        int n = mat.length;
        int m = mat[0].length;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;  
                    queue.add(new int[]{i, j});
                } else {
                    ans[i][j] = Integer.MAX_VALUE; 
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] coor = queue.poll();
            int i = coor[0];
            int j = coor[1];
            if (i - 1 >= 0 && ans[i - 1][j] > ans[i][j] + 1) {
                ans[i - 1][j] = ans[i][j] + 1;
                queue.add(new int[]{i - 1, j});
            }
            if (i + 1 < n && ans[i + 1][j] > ans[i][j] + 1) {
                ans[i + 1][j] = ans[i][j] + 1;
                queue.add(new int[]{i + 1, j});
            }
            if (j - 1 >= 0 && ans[i][j - 1] > ans[i][j] + 1) {
                ans[i][j - 1] = ans[i][j] + 1;
                queue.add(new int[]{i, j - 1});
            }
            if (j + 1 < m && ans[i][j + 1] > ans[i][j] + 1) {
                ans[i][j + 1] = ans[i][j] + 1;
                queue.add(new int[]{i, j + 1});
            }
        }
        return ans;
    }
}