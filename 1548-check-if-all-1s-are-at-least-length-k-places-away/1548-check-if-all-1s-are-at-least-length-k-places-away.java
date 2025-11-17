class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(last == Integer.MIN_VALUE){
                    last = i;
                }
                else{
                    if(i-last-1<k) return false;
                    last = i;
                }
            }
        }
        return true;
    }
}