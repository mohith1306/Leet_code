class Solution {
    public boolean isPrime(int i){
        if(i < 2) return false;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i % j == 0 ) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:nums){
            if(isPrime(map.get(val))){
                return true;
            }
        }
        return false;
    }
}