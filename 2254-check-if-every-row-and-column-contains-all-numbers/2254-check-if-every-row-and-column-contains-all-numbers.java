class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int[] rowCheck = new int[n];
            int[] colCheck = new int[n];

            for (int j = 0; j < n; j++) {
                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];
                if (rowCheck[rowVal - 1] == 1 || colCheck[colVal - 1] == 1) {
                    return false;
                }

                rowCheck[rowVal - 1] = 1;
                colCheck[colVal - 1] = 1;
            }
        }

        return true;
    }
}
