class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        ArrayList<int[]> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            int[] pair1 = nums1[i];
            int[] pair2 = nums2[j];

            if (pair1[0] == pair2[0]) {
                result.add(new int[]{pair1[0], pair1[1] + pair2[1]});
                i++;
                j++;
            } else if (pair1[0] < pair2[0]) {
                result.add(pair1);
                i++;
            } else {
                result.add(pair2);
                j++;
            }
        }

        while (i < nums1.length) {
            result.add(nums1[i++]);
        }

        while (j < nums2.length) {
            result.add(nums2[j++]);
        }

        return result.toArray(new int[result.size()][]);
    }
}
