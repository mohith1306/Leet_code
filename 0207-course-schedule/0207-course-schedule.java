class Solution {
    public boolean dfs(int index, int[] visited, List<List<Integer>> adj) {
        if (visited[index] == 1) return false;
        if (visited[index] == 2) return true; 
        
        visited[index] = 1; 
        for (int node : adj.get(index)) {
            if (!dfs(node, visited, adj)) {
                return false;
            }
        }
        visited[index] = 2; 
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] course : prerequisites) {
            adj.get(course[1]).add(course[0]);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, visited, adj)) {
                    return false; 
                }
            }
        }
        return true;
    }
}
