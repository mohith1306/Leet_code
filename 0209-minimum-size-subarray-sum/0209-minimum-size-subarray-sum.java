class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            j++;
            while(sum >= target){
                min_length = Math.min(min_length,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length-1;
    }
}