class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total += nums[i];
        }
        int i = 0;
        int target = total - x;
        if(target< 0){
            return -1;
        }
        int maxLen = -1;
        int cur = 0;
        for(int j=0;j<n;j++){
            cur += nums[j];
            while(i<=j && cur>target) {
                cur -= nums[i++];
            }
            if(cur == target) {
                maxLen = Math.max(maxLen,j-i+1);
            }
        }
        if(maxLen == -1) {
            return -1;
        }
        return n-maxLen;
    }
}