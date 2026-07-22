class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int onecnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                onecnt++;
                max = Math.max(max,onecnt);
            }else{
                onecnt = 0;
            }
        }
        return max;
    }
}