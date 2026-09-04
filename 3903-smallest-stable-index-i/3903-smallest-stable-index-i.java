class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                max[i] = nums[0];
            }else{
                max[i] = Math.max(max[i-1],nums[i]);
            }
        }

        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                min[i] = nums[n-1];
            }else{
                min[i] = Math.min(min[i+1],nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            int diff = max[i] - min[i];
            if(diff<=k){
                return i;
            }
        }

        return -1;
    }
}