class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        solve(nums,n,0,0,target);
        return count;
    }
    public void solve(int[] nums,int n,int idx,int sum,int target) {
        if(idx == n) {
            if(sum == target) {
                count++;
            }
            return;
        }
        solve(nums,n,idx+1,sum+nums[idx],target);
        solve(nums,n,idx+1,sum-nums[idx],target);
    }
}