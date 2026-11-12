class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxInc = 1;
        int Inc = 1;
        int Dec = 1;
        int maxDec = 1;

        for(int i=1;i<n;i++) {
            if(nums[i] > nums[i-1]) {
                Inc++;
                maxInc = Math.max(maxInc,Inc);
            }else{
                Inc = 1;
            }
        }

        for(int i=1;i<n;i++) {
            if(nums[i] < nums[i-1]) {
                Dec++;
                maxDec = Math.max(maxDec,Dec);
            }else{
                Dec = 1;
            }
        }

        return Math.max(maxInc,maxDec);
    }
}