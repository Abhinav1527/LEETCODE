class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        int sum = 0;
        for(int x : weights){
            max = Math.max(max,x);
            sum += x;
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(weights,mid,days,n)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] a,int mid,int days,int n){
        int cnt = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+a[i]>mid){
                cnt++;
                sum = a[i];
            }else{
                sum += a[i];
            }
        }
        return cnt<=days;
    }
}