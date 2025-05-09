class Solution {
    public int binarySearch(int[] nums){
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid % 2 != 0 && nums[mid] == nums[mid-1])){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
    public int singleNonDuplicate(int[] nums) {
        return binarySearch(nums);
    }
}