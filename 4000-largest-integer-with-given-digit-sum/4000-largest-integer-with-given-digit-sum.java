class Solution {
    public int largestInteger(int n, int s) {
        int limit = (int)Math.pow(10,n);
        int max = -1;
        for(int i=0;i<limit;i++){
            int len = 0;
            int sum = 0;
            int num = i;

            if(i==0){
                len = 1;
            }
            while(num>0){
                int r = num%10;
                sum += r;
                len++;
                num /= 10;
            }
            if(len <= n && sum == s){
                max = Math.max(max,i);
            }
        }
        return max;
    }
}