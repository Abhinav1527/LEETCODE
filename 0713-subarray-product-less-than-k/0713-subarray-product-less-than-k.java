class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) {
            return 0;
        }
        int i = 0;
        int prod = 1;
        int count = 0;
        for(int j=0;j<n;j++) {
            prod *= nums[j];
            while(prod>=k && i<n) {
                prod /= nums[i++];
            }
            count += j-i+1;
        }
        return count;
    }
}