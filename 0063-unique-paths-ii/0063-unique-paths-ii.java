class Solution {
    public int dp(int i,int j,int[][] arr,int[][] helper){
        if(i ==0 && j == 0 && arr[i][j] != 1) return 1;
        if(i < 0 || j < 0) return 0;
        if(arr[i][j] == 1) return 0;
        if(helper[i][j] != -1) return helper[i][j];
        int up = dp(i-1,j,arr,helper);
        int left = dp(i,j-1,arr,helper);
        return helper[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // if(obstacleGrid[0][0] == 1) return 0;
        int[][] helper = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] row:helper){
            Arrays.fill(row,-1);
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return dp(m-1,n-1,obstacleGrid,helper);
    }
}