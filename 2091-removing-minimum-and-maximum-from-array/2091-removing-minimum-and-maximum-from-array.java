class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIdx]){
                minIdx = i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx = i;
            }
        }

        int min = Math.min(minIdx,maxIdx);
        int max = Math.max(minIdx,maxIdx);

        return Math.min(Math.min(max+1,n-min),min+1+n-max);
    }
}