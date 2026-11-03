class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int maxEle = 0;
        for(int i=0;i<n;i++) {
            maxEle = Math.max(maxEle,nums[i]);
        }
        int ans = 0;
        for(int num : nums) {
            ans += maxEle - num;
        }
        return ans;
    }
}