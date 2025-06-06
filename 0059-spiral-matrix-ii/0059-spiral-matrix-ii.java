class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=i;j<n-i;j++){
                matrix[i][j] = count++;
            }
            for(int k=i+1;k<n-i;k++){
                matrix[k][n-i-1]=count++;
            }
            for(int l=n-i-2;l>=i;l--){
                matrix[n-i-1][l]=count++;
            }
            for(int m=n-i-2;m>i;m--){
                matrix[m][i] = count++;
            }
        }
        return matrix;
    }
}