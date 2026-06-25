class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int istar = 0;
            for(int j=i;j<n;j++){
                int sub_len = j-i+1;
                if(nums[j] == target){
                    istar++;
                }
                if(istar > sub_len/2){
                ans++;
                }
            }
        }
        return ans;
    }
}