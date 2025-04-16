import java.util.Arrays;

class Solution {
    public int dp(int index, int target, int[] coins, int[][] arr) {
        if (index == 0) {
            if (target % coins[index] == 0) {
                return target / coins[index];
            }
            return (int) Math.pow(10, 9);
        }

        if (arr[index][target] != -1) return arr[index][target];

        int notTaken = dp(index - 1, target, coins, arr);
        int taken = (int) Math.pow(10, 9);

        if (coins[index] <= target) {
            taken = 1 + dp(index, target - coins[index], coins, arr);
        }

        return arr[index][target] = Math.min(notTaken, taken);
    }

    public int coinChange(int[] coins, int amount) {
        int[][] arr = new int[coins.length][amount + 1];
        for (int[] rows : arr) {
            Arrays.fill(rows, -1);
        }
        
        int ans = dp(coins.length - 1, amount, coins, arr);
        return (ans >= (int) Math.pow(10, 9)) ? -1 : ans;
    }
}
