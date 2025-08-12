import java.util.*;

class Solution {
    static final int MOD = 1000000007;

    public int func(ArrayList<Integer> array, int[][] dp, int target, int count, int index) {
        if (count == target) return 1;           
        if (count > target || index < 0) return 0; 
        if (dp[index][count] != -1) return dp[index][count];

        int take = func(array, dp, target, count + array.get(index), index - 1);
        int notTake = func(array, dp, target, count, index - 1);

        return dp[index][count] = (int)(((long)take + notTake) % MOD);
    }

    public int numberOfWays(int n, int x) {
        ArrayList<Integer> array = new ArrayList<>();
        int i = 1;
        while (Math.pow(i, x) <= n) {
            array.add((int)Math.pow(i, x));
            i++;
        }
        int len = array.size();
        int[][] dp = new int[len + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(array, dp, n, 0, len - 1);
    }
}
