class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = 1001;
        int max = 0;
        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        while(b>0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}