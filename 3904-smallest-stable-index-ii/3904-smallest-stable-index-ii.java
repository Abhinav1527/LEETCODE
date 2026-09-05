class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];

        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                min[i] = nums[n-1];
            }else{
                min[i] = Math.min(nums[i],min[i+1]);
            }
        }

        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            if(max-min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}