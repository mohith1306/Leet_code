class Solution {
    public int func(ArrayList<Integer> array, int[][] dp, int n, int count, int index){
        if(count == n) return 0;
        if(index < 0 || count > n) return Integer.MAX_VALUE / 2;
        if(dp[index][count] != -1) return dp[index][count];
        int take = 1+func(array, dp, n, count + array.get(index), index);
        int notTake = func(array, dp, n, count, index-1);
        return dp[index][count] = Math.min(take, notTake);
    }
    public int numSquares(int n) {
        int i = 1;
        ArrayList<Integer> array = new ArrayList<>();
        while(Math.pow(i,2) <= n){
            array.add((int)Math.pow(i,2));
            i++;
        }
        int len = array.size();
        int[][] dp = new int[len+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        return func(array, dp, n, 0, len-1);
    }
}