class Solution {
    public int longestSubarray(int[] nums) {
        
        int length = 0;
        int zeroes = 0;
        int low = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroes++;
            }
            while(zeroes > 1){
                if(nums[low] == 0){
                    zeroes--;
                }
                low++;
            }
            length = Math.max(length, i-low);
        }
        return length;
    }
}