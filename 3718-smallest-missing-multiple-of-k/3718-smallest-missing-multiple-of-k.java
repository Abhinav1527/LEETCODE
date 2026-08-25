class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] res = new boolean[101];

        for (int num : nums) {
            res[num] = true;
        }

        for (int i = k; ; i += k) {
            if (i > 100 || !res[i]) {
                return i;
            }
        }
    }
}