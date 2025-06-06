class Solution {
    public int dp(int i,int j,int[][] arr){
        if(i == 0 && j == 0) return 1;
        if( i < 0 || j < 0 ) return 0;
        if(arr[i][j] != -1) return arr[i][j];
        int up = dp(i-1,j,arr);
        int left = dp(i,j-1,arr);
        return arr[i][j] = up + left;
    }
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int[] row:arr){
            Arrays.fill(row,-1);
        }
        return dp(m-1,n-1,arr);
    }
}