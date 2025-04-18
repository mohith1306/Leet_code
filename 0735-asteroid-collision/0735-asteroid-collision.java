class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int size: asteroids) {
            while(!stack.isEmpty() && size < 0 && stack.peek() > 0){
                if(stack.peek() < -size){
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == -size){
                    stack.pop();
                }
                size = 0;
            }
            if(size != 0){
                stack.push(size);
            }
        }  
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}