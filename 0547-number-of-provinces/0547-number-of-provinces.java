class Solution {
    public void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }
}
