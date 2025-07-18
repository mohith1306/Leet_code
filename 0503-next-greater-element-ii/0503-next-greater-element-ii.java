class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = (2*n)-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(i < n){
                if(stack.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = stack.peek();
                }
            }
            stack.push(nums[i % n]);
        }
        return ans;
    }
}