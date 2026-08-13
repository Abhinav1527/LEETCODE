class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        int low = 1;
        int high = max;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(nums,mid,threshold,n)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] nums,int mid,int threshold,int n){
        int cnt = 0;
        for(int i=0;i<n;i++){
            cnt += (nums[i]+mid-1)/mid;
        }
        return cnt<=threshold;
    }
}