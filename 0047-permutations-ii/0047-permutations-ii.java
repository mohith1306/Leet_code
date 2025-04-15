import java.util.*;

class Solution {
    public void rec(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> finalArray) {
        if (temp.size() == nums.length) {
            finalArray.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            temp.add(nums[i]);
            rec(nums, used, temp, finalArray);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> finalArray = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        rec(nums, used, new ArrayList<>(), finalArray);
        return finalArray;
    }
}
