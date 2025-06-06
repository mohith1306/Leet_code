class Solution {

    public boolean dp(int[] nums,int sum,int index,int[][] arr){
        if(sum == 0) return true;
        if(index == 0) return nums[index] == sum;
        if(arr[index][sum] != -1) return arr[index][sum] == 0 ? false : true;
        boolean notTaken = dp(nums,sum,index-1,arr);
        boolean taken = false;
        if(nums[index] <= sum){
            taken = dp(nums,sum-nums[index],index-1,arr);
        }
        arr[index][sum] = notTaken || taken ? 1 : 0;
        return  taken || notTaken;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int m = nums.length;
        for(int digit:nums){
            sum+=digit;
        }
        if(sum % 2 !=0){
            return false;
        }
        int[][] arr = new int[m][sum/2+1];
        for(int[] rows: arr){
            Arrays.fill(rows,-1);
        }
        return dp(nums,sum/2,m-1,arr);
    }
}