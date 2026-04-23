class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        long[] arr=new long[nums.length];
        for(ArrayList<Integer> lst: map.values()){
            int n=lst.size();
            if(n==1){
                arr[lst.get(0)]=0;
            }
            else{
                long[] prefix=new long[n];
                prefix[0]=lst.get(0);
                for(int i=1;i<n;i++){
                    prefix[i]=prefix[i-1]+lst.get(i);
                }
                for(int i=0;i<n;i++){
                    int idx=lst.get(i);
                    long ans=0;
                    ans += (long)idx*i - (i>0 ? prefix[i-1] : 0);
                    ans += (prefix[n-1]-prefix[i]) - (long)idx*(n-i-1);
                    arr[idx]=ans;
                }
            }
        }
        return arr;
    }
}
