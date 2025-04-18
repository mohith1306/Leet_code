class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int size = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int totalSize = rows * columns;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<rows;i++){
            if(size == totalSize) break;
            for(int j=i;j<=columns-i-1;j++){
                ans.add(matrix[i][j]);
                size++;
            }
            if(size == totalSize) break;
            for(int k = i+1;k<=rows-i-1;k++){
                ans.add(matrix[k][columns-i-1]);
                size++;
            }
            if(size == totalSize) break;
            for(int l = columns-i-2;l>=i;l--){
                ans.add(matrix[rows-i-1][l]);
                size++;
            }
            if(size == totalSize) break;
            for(int m = rows-i-2;m>i;m--){
                ans.add(matrix[m][i]);
                size++;
            }
        }
        return ans;
    }
}