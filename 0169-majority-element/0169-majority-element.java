class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length/2;
        int count = 0;
        for(int i:hm.keySet()){
            if(hm.get(i) > n){
                count = i;
            }
        }
        return count;
    }
}