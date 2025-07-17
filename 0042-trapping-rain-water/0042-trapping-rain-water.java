class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int n = height.length;
        int total = 0;
        int right = n-1;
        while(left < right){
            if(height[left] <= height[right]){
                if(leftMax > height[left]){
                    total = total + leftMax - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if(rightMax > height[right]){
                    total = total + rightMax - height[right];
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
}