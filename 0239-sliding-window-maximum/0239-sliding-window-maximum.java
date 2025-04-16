class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dequeue = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            while(!dequeue.isEmpty() && dequeue.getLast() < val){
                dequeue.pollLast();
            }
            dequeue.addLast(val);
            if(i >= k && nums[i-k] == dequeue.getFirst()){
                dequeue.pollFirst();
            }
            if(i >= k-1){
                ans.add(dequeue.getFirst());
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}