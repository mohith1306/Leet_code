import java.util.Arrays;

class Solution {
    public int func(int[] arr, int[] dp, int start, int index){
        if(index < start) return 0;
        if(index == start) return arr[index];
        if(dp[index] != -1) return dp[index];

        int pick = arr[index] + func(arr, dp, start, index - 2);
        int notPick = func(arr, dp, start, index - 1);

        return dp[index] = Math.max(pick, notPick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = func(nums, dp1, 0, n - 2);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = func(nums, dp2, 1, n - 1);

        return Math.max(case1, case2);
    }
}
