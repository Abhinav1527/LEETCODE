class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int oper = 0;
        int prev = nums[0];
        for(int i=1;i<n;i++){
            if(prev >= nums[i]){
                oper += prev+1-nums[i];
                prev += 1;
            }else{
                prev = nums[i];
            }
        }
        return oper;
    }
}