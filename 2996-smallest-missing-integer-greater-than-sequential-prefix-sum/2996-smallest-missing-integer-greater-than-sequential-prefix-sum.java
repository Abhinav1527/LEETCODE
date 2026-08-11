class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int seqsum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] - nums[i-1] == 1){
                seqsum += nums[i];
            }else{
                break;
            }
        }
        boolean[] vis = new boolean[52];
        for(int i=0;i<n;i++){
            vis[nums[i]] = true;
        }
        if(seqsum>50){
            return seqsum;
        }
        for(int i=seqsum;i<52;i++){
            if(!vis[i]){
                return i;
            }
        }
        return -1;
    }
}