class Solution {
    public int rec(int[] arr,int[] dp,int index){
        if(index <  0) return 0;
        if(index == 0) return arr[index];
        if(dp[index] != -1) return dp[index];
        int pick = rec(arr,dp,index-2) + arr[index];
        int nopick = rec(arr,dp,index-1) + 0;
        return dp[index] = Math.max(pick,nopick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(nums,dp,nums.length-1);
    }
}