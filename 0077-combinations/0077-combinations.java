class Solution {
    public void func(int start, List<List<Integer>> finalArray,List<Integer> tempArray,int n,int k){
        if(tempArray.size() == k) {
            finalArray.add(new ArrayList<>(tempArray));
            return;
        }
        for(int i=start;i<=n;i++){
            tempArray.add(i);
            func(i+1,finalArray,tempArray,n,k);
            tempArray.remove(tempArray.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalArray = new ArrayList<>();
        List<Integer> tempArray = new ArrayList<>();
        func(1,finalArray,tempArray,n,k);
        return finalArray;
    }
}