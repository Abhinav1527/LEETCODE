class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        long sum = 0;
        long score = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            sum += nums[j];
            score = sum * (j - i + 1);
            while (score >= k) {
                sum -= nums[i++];
                score = sum * (j - i + 1);
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
}