class Solution {
    int count = 0;
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int or = 0;
        for(int x : nums){
            or |= x;
        }
        solve(nums,n,0,or,0);
        return count;
    }
    public void solve(int[] nums,int n,int idx,int or,int ans) {
        if(idx == n){
            if(ans == or){
                count++;
            }
            return;
        }
        solve(nums,n,idx+1,or,(ans|nums[idx]));
        solve(nums,n,idx+1,or,ans);
    }
}