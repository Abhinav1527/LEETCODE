class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=0;j<n;j++) {
            if(nums[j] % 2 == 0) {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
            }
        }
        return nums;
    }
}