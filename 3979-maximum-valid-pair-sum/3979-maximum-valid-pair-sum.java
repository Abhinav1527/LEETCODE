class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;

        int maxLeft = nums[0];
        int maxSum = 0;
        int i =0;
        for(int j=k;j<n;j++){
            maxLeft = Math.max(maxLeft,nums[i]);
            maxSum = Math.max(maxSum,maxLeft+nums[j]);
            i++;
        }
        return maxSum;
    }
}