class Solution {
    public int func(int index, int count, int[] nums, int[][] dp, int offset, int target) {
        if (index < 0) return count == target ? 1 : 0;

        if (dp[index][count + offset] != -1) return dp[index][count + offset];

        int plus = func(index - 1, count + nums[index], nums, dp, offset, target);
        int minus = func(index - 1, count - nums[index], nums, dp, offset, target);

        dp[index][count + offset] = plus + minus;
        return dp[index][count + offset];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (target > sum || target < -sum) return 0;

        int offset = sum;
        int[][] dp = new int[nums.length][2 * sum + 1];

        for (int[] row : dp) Arrays.fill(row, -1);

        return func(nums.length - 1, 0, nums, dp, offset, target);
    }
}
