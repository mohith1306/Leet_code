class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int digit : arr) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        int val = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == value) {
                val = Math.max(val, value);
            }
        }

        return val;
    }
}
