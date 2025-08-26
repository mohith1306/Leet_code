class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int len = rect[0];
            int width = rect[1];
            int diagSq = (len * len) + (width * width);
            int area = len * width;

            if (diagSq > maxDiagSq) {
                maxDiagSq = diagSq;
                maxArea = area;
            } else if (diagSq == maxDiagSq && area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
