class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        return pick(nums,n,0,0);
    }
    public int pick(int[] nums,int n,int idx,int xor){
        if(idx == n){
            return xor;
        }
        int inc = pick(nums,n,idx+1,xor^nums[idx]);
        int ex = pick(nums,n,idx+1,xor);

        return inc+ex;
    }
}