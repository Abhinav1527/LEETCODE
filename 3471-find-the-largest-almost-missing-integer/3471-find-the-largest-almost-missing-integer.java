class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int[] freq = new int[51];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            max = Math.max(max,nums[i]);
        }
        if(k==1){
            for(int i=50;i>=0;i--){
                if(freq[i] == 1){
                    return i;
                }
            }
        }else if(k==n){
            return max;
        }else{
            if(nums[0] != nums[n-1]){
                if(freq[nums[n-1]] == 1 && freq[nums[0]] == 1){
                    return Math.max(nums[0],nums[n-1]);
                }else if(freq[nums[n-1]] > 1 && freq[nums[0]] == 1){
                    return nums[0];
                }else if(freq[nums[0]] > 1 && freq[nums[n-1]] == 1){
                    return nums[n-1];
                }
            }
        }
        return -1;
    }
}