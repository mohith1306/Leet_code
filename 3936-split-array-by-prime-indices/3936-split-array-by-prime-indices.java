class Solution {
    public boolean isPrime(int index){
        if(index == 1 || index == 0) return false;
        for(int i=2;i<=(int)Math.sqrt(index);i++){
            if(index % i == 0)return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long a = 0;
        long b = 0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)){
                a+=(long)nums[i];
            }
            else{
                b+=(long)nums[i];
            }
        }
        return Math.abs(b - a);
    }
}