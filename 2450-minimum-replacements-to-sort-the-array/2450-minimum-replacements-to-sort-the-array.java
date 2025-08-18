class Solution {
    public long minimumReplacement(int[] nums) {
        long operations = 0;
        for(int i = nums.length - 2;i>=0;i--){
            if(nums[i]< nums[i+1]) continue;
            else{
                int curr = nums[i];
                int next = nums[i+1];
                int pieces = (curr + next - 1) / next;
                operations += (pieces -1);
                nums[i] = curr / pieces;
            }
        }
        return operations;
    }
}