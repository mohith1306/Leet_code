class Solution {
    class Pair {
        int node;
        int cost;
        int stop;
        Pair(int node, int cost, int stop) {
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] f : flights){
            adj.get(f[0]).add(new int[]{f[1], f[2]});
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.cost - b.cost
        );

        pq.offer(new Pair(src, 0, 0));
        int[][] dist = new int[n][k + 2];
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        dist[src][0] = 0;

        while(!pq.isEmpty()){

            Pair curr = pq.poll();

            if(curr.node == dst) return curr.cost;

            if(curr.stop > k) continue;

            for(int[] nei : adj.get(curr.node)){
                int next = nei[0];
                int price = nei[1];

                int newCost = curr.cost + price;

                if(newCost < dist[next][curr.stop + 1]){
                    dist[next][curr.stop + 1] = newCost;
                    pq.offer(new Pair(next, newCost, curr.stop + 1));
                }
            }
        }

        return -1;
    }
}
