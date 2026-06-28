class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        int n = nums.length;
        long sum = 0;
        int t = Math.min(k,Math.max(0,mul-1));
        int idx = n-1;
        for(int i=mul;i>=2&&t>0;i--){
            sum += 1L*nums[idx]*i;
            idx--;
            t--;
        }
        int r = k - Math.min(k,Math.max(0,mul-1));
        while(r-->0){
            sum += nums[idx];
            idx--;
        }
        return sum;
    }
}