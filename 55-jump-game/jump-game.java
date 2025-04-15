class Solution {
    private boolean dp(int[] nums, int index, Boolean[] memo) {
        if (index >= nums.length - 1)
            return true;
        if (memo[index] != null)
            return memo[index];
        int maxJump = nums[index];
        for (int i = index + 1; i <= index + maxJump && i < nums.length; i++) {
            if (dp(nums, i, memo)) {
                memo[index] = true;
                return true;
            }
        }
        memo[index] = false;
        return false;
    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] memo = new Boolean[n];
        return dp(nums, 0, memo);
    }
}
