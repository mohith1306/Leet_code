class Solution {
    public double champagneTower(int totalPoured, int targetRow, int targetGlass) {
        double[][] tower = new double[102][102];
        tower[0][0] = (double) totalPoured;
        for (int row = 0; row <= targetRow; ++row) {
            for (int glass = 0; glass <= row; ++glass) {
                double overflow = (tower[row][glass] - 1.0) / 2.0;
                if (overflow > 0) {
                    tower[row + 1][glass] += overflow;
                    tower[row + 1][glass + 1] += overflow;
                }
            }
        }
        return Math.min(1, tower[targetRow][targetGlass]);
    }
}
