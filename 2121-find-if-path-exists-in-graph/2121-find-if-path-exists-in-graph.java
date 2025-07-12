import java.util.*;

class Solution {
    public boolean dfs(int index, int destination, List<List<Integer>> adj, boolean[] visited) {
        if (index == destination) return true;

        visited[index] = true;

        for (int neighbor : adj.get(index)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }
}
