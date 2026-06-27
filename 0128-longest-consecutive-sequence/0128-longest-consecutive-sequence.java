class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int maxLen = 1;
        int cur = 1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]) continue;

            if(nums[i] == nums[i-1]+1){
                cur++;
            }else{
                maxLen = Math.max(maxLen,cur);
                cur = 1;
            }
        }
        maxLen = Math.max(maxLen,cur);
        return maxLen;
    }
}