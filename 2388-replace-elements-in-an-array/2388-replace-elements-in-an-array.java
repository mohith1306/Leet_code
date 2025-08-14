class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int[] op : operations) {
            int num1 = op[0];
            int num2 = op[1];
            if (map.containsKey(num1)) {
                int index = map.get(num1);
                nums[index] = num2;
                map.remove(num1);
                map.put(num2, index);
            }
        }
        return nums;
    }
}