class Solution {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    int v1 = Math.abs(nums[i] - nums[j]);
                    int v2 = Math.abs(nums[j] - nums[k]);
                    int v3 = Math.abs(nums[i] - nums[k]);

                    if(v1<=a && v2<=b && v3<=c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}