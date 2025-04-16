class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int digit:nums){
            map.put(digit,map.getOrDefault(digit,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;

    }
}