class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int m1 = -1001;
        int m2 = -1001;
        int m3 = -1001;

        int s1 = 1001;
        int s2 = 1001;

        for(int i=0;i<n;i++){
            if(m1<nums[i]){
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }else if(nums[i] > m2){
                m3 = m2;
                m2 = nums[i];
            }else if(nums[i]>m3){
                m3 = nums[i];
            }

            if(nums[i]<s1){
                s2 = s1;
                s1 = nums[i];
            }else if(nums[i]<s2){
                s2 = nums[i];
            }
        }
        return Math.max(m1*m2*m3,m1*s1*s2);
    }
}