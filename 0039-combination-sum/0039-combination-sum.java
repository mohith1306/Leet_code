class Solution {


    private void finalans(int ind,int[] candidates,int target,List<List<Integer>> ans, List<Integer> ds){
        if(ind == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[ind] <= target){
            ds.add(candidates[ind]);
            finalans(ind,candidates,target - candidates[ind],ans,ds);
            ds.remove(ds.size() - 1);
        }
        finalans(ind+1,candidates,target,ans,ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        finalans(0,candidates,target,ans, new ArrayList<>());
        return ans;
    }
}