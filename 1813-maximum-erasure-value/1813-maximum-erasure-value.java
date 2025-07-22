class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right =0;
        boolean[] visited = new boolean[10001];
        int currentSum = 0;
        int maxSum = 0;
        while(right < len){
            while(visited[nums[right]]){
                currentSum -= nums[left];
                visited[nums[left]] = false;
                left++;
            }
            currentSum += nums[right];
            visited[nums[right]] = true;
            maxSum = Math.max(currentSum,maxSum);
            right++;
        }
        return maxSum;
    }
}