class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        long sum = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            sum += nums[j];
            while (sum * (j - i + 1) >= k) {
                sum -= nums[i++];
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
}