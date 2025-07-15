class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0, right = plants.length - 1;
        int currentA = capacityA;
        int currentB = capacityB;
        int refills = 0;

        while (left < right) {
            if (currentA < plants[left]) {
                refills++;
                currentA = capacityA;
            }
            currentA -= plants[left];
            left++;

            if (currentB < plants[right]) {
                refills++;
                currentB = capacityB;
            }
            currentB -= plants[right];
            right--;
        }
        if (left == right) {
            int maxWater = Math.max(currentA, currentB);
            if (maxWater < plants[left]) {
                refills++;
            }
        }

        return refills;
    }
}
