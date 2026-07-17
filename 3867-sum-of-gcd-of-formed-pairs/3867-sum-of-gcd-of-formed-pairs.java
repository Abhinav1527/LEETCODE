class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] pregcd = new int[n];
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            pregcd[i] = gcd(max,nums[i]);
        }
        Arrays.sort(pregcd);
      
        int i = 0;
        int j = n-1;
        long sum = 0;
        while(i<j){
            sum += (long)gcd(pregcd[i],pregcd[j]);
            i++;
            j--;
        }
        return sum;
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