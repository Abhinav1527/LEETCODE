class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];
        
        int pos1 = solve(nums,0,n-2);
        int pos2 = solve(nums,1,n-1);

        return Math.max(pos1,pos2);
    }
    public int solve(int[] nums,int start,int end) {
        int prev1 = 0;
        int prev2 = 0;

        int ans  = 0;
        for(int i=start;i<=end;i++) {
            ans = Math.max(prev1,prev2 + nums[i]);
            prev2 = prev1;
            prev1 = ans;
        }

        return ans;
    }
}