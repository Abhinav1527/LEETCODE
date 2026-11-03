class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int maxEle = 0;
        int sum = 0;

        for(int i=0;i<n;i++) {
            sum += nums[i];
            maxEle = Math.max(maxEle,nums[i]);
        }
        return n*maxEle - sum;
    }
}