class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> (reward1[b] - reward2[b]) - (reward1[a] - reward2[a]));
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += reward1[indices[i]];
        }
        for (int i = k; i < n; i++) {
            total += reward2[indices[i]];
        }
        return total;
    }
}
