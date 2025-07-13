class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int leftLength = g.length;
        int rightLength = s.length;
        int count = 0;
        int left = 0;
        int right = 0;
        while(left < leftLength && right < rightLength){
            if(g[left] <= s[right]){
                count++;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return count;
    }
}