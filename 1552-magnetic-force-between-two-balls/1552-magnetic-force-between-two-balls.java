class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = position[n-1] - position[0];

        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isValid(position,mid,m,n)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] a,int mid,int m,int n){
        int cnt = 1;
        int lastpos = a[0];
        for(int i=0;i<n;i++){
            if(a[i] - lastpos >= mid){
                cnt++;
                lastpos = a[i];
            }
        }
        return cnt>=m;
    }
}