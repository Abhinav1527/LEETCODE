class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        boolean allZeros = true;
        for(int i=0;i<n;i++){
            xor ^= nums[i];

            if(nums[i] != 0){
                allZeros = false;
            }
        }
        if(allZeros){
            return 0;
        }
        if(xor != 0){
            return n;
        }

        return n-1;
    }
}