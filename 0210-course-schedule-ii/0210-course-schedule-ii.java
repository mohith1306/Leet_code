class Solution {
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> graph, int[] visited, Stack<Integer> result) {
        visited[node] = 1;
        for (int adjNode : graph.get(node)) {
            if (visited[adjNode] == 1) {
                return false;
            }
            if (visited[adjNode] == 0) {
                if (!dfs(adjNode, graph, visited, result)) return false;
            }
        }
        visited[node] = 2;
        result.push(node);
        return true;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];
            adjList.get(prereq).add(course);
        }

        int[] visited = new int[numCourses];
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, adjList, visited, result)) {
                    return new int[0];
                }
            }
        }

        int[] ans = new int[numCourses];
        int i = 0;
        while (!result.isEmpty()) {
            ans[i++] = result.pop();
        }
        return ans;
    }
}
