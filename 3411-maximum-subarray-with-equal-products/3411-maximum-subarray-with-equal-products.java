class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for(int i=0;i<n;i++) {
            int p = nums[i];
            int g = nums[i];
            int l = nums[i];
            for(int j=i+1;j<n;j++) {
                p = p * nums[j];
                g = gcd(g,nums[j]);
                l = (l*nums[j])/gcd(l,nums[j]);

                if(p > g*l) {
                    break;
                }

                if(p == g*l) {
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public int gcd(int a,int b) {
        while(b != 0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}