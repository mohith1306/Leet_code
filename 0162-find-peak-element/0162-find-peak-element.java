class Solution {
    public int findPeakElement(int[] nums) {
        int l =  0;
        int r = nums.length - 1;

        if(nums.length == 1) return 0;
        while(l < r){
            int mid = l + ((r-l) / 2);
            if(l == mid || r == mid){
                if(nums[l] > nums[r]){
                    return l;
                }
                else{
                    return r;
                }
            }
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]){
                l = mid+1;
            }
            else{
                r = mid - 1;
            }
        }
        return l;
    }
}