class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = 0.0;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxAvg = (double)sum/k;
        int i = 0;
        for(int j=k;j<n;j++){
            sum = sum + nums[j] - nums[i++];
            double avg = (double)sum/k;
            maxAvg = Math.max(maxAvg,avg);
        }
        return maxAvg;
    }
}