class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int num = nums[i];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while(num>0){
                max = Math.max(max,num%10);
                min = Math.min(min,num%10);
                num /= 10;
            }
            arr[i] = max-min;
        }
        int maxD = 0;
        for(int i=0;i<n;i++){
            maxD = Math.max(maxD,arr[i]);
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == maxD){
                sum += nums[i];
            }
        }
        return sum;
    }
}