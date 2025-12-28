class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        int negative = 0, zero = 0, positive = 0;
        for (int num : nums) {
            if (num < 0) negative++;
            else if (num > 0) positive++;
            else zero++;
        }
        if (zero == nums.length) return 0;
        if (negative == 1 && positive == 0 && zero == 0) {
            return nums[0];
        }
        long product = 1;
        boolean used = false;
        int negLimit = (negative % 2 == 0) ? negative : negative - 1;
        for (int i = 0; i < negLimit; i++) {
            product *= nums[i];
            used = true;
        }
        int startPos = negative + zero;
        for (int i = startPos; i < nums.length; i++) {
            product *= nums[i];
            used = true;
        }
        if (!used) return 0;

        return product;
    }
}
