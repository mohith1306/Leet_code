class Solution {
    public void dfs(int index, boolean[] visited, List<List<Integer>> rooms){
        visited[index] = true;

        for(int node: rooms.get(index)){
            if(!visited[node]){
                dfs(node, visited,  rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(0, visited, rooms);
        for(int i=0;i<n;i++){
            if(visited[i] == false) return false;
        }
        return true;
    }
}