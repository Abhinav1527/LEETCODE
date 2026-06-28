class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        nums[0] = 1;
        for(int i=1;i<n;i++){
            int diff = nums[i] - nums[i-1];
            if(diff>1){
                nums[i] = nums[i-1]+1;
            }
        }
        return nums[n-1];
    }
}