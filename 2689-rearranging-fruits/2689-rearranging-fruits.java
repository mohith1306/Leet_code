class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer, Integer> totalMap = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int cost:basket1){
            totalMap.put(cost,totalMap.getOrDefault(cost,0)+1);
            map1.put(cost,map1.getOrDefault(cost,0)+1);
            
        }
        
        for(int cost:basket2){
            totalMap.put(cost,totalMap.getOrDefault(cost,0)+1);
            map2.put(cost,map2.getOrDefault(cost,0)+1);
        }
        for(HashMap.Entry<Integer, Integer> set: totalMap.entrySet()){
            if(set.getValue() % 2 != 0){
                return -1;
            }
        }
        ArrayList<Integer> surplus = new ArrayList<>();

        // find the surplus in basket1
        for (Map.Entry<Integer, Integer> entry : totalMap.entrySet()) {
            int key = entry.getKey();
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            int diff = count1 - count2;
            // if there's surplus in one basket, add half of it to the swap list
            if (diff > 0) {
                for (int i = 0; i < diff / 2; i++) {
                    surplus.add(key);
                }
            }
        }

        // find the surplus in basket2 (reverse direction)
        for (Map.Entry<Integer, Integer> entry : totalMap.entrySet()) {
            int key = entry.getKey();
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            int diff = count2 - count1;
            if (diff > 0) {
                for (int i = 0; i < diff / 2; i++) {
                    surplus.add(key);
                }
            }
        }

        Collections.sort(surplus);

        int minElement = Integer.MAX_VALUE;
        for (int cost : totalMap.keySet()) {
            minElement = Math.min(minElement, cost);
        }

        long cost = 0;
        int n = surplus.size() / 2;
        for (int i = 0; i < n; i++) {
            cost += Math.min(surplus.get(i), 2 * minElement);
        }

        return cost;
    }
}