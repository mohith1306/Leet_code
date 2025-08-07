class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prevTime = customers[0][0] + customers[0][1];
        long waitingTime = customers[0][1];
        for (int i = 1; i < customers.length; i++) {
            if (prevTime > customers[i][0]) {
                waitingTime += prevTime + customers[i][1] - customers[i][0];
                prevTime = prevTime + customers[i][1];
            } else {
                waitingTime += customers[i][1];
                prevTime = customers[i][0] + customers[i][1];
            }
        }

        return (double) waitingTime / customers.length;
    }
}
