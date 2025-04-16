class Solution {
    public int func(int amount,int[] coins,int index,int[][] dp){
        if (index == 0) return (amount % coins[0] == 0) ? 1 : 0;
        if(index < 0) return 0;
        if(dp[index][amount] != -1) return dp[index][amount];
        int notTake = func(amount,coins,index-1,dp);
        int take = 0;
        if(coins[index] <= amount) take = func(amount-coins[index],coins,index,dp);
        return dp[index][amount]=take + notTake;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(amount,coins,coins.length-1,dp);
    }
}