class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        int maxEle = 0;
        int count = 0;
        for(int num : nums) {
            maxEle = Math.max(maxEle,num);
        }
        for(int i=0;i<n;i++) {
            if(nums[i] == maxEle) {
                count++;
            }else{
                count = 0;
            }
            maxLen = Math.max(maxLen,count);
        }

        return maxLen;
    }
}