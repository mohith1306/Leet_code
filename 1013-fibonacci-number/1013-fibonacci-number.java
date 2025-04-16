class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        ArrayList<Integer>lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        for(int i=2;i<n+1;i++){
            lst.add(lst.get(i-1)+lst.get(i-2));
        }
        return lst.get(lst.size()-1);

    }
}