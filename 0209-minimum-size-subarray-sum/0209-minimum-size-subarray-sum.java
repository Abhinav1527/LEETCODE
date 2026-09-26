class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = n + 1;
        int i = 0;
        int sum = 0;
        for(int j=0;j<n;j++) {
            sum += nums[j];
            while(sum>=target) {
                minLen = Math.min(minLen,j-i+1);
                sum -= nums[i++];
            } 
        }
        if(minLen == n+1) {
            return 0;
        }
        return minLen;
    }
}