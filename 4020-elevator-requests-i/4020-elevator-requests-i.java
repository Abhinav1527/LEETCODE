class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = 0;
        int cur = 0;
        for(int i=0;i<requests.length;i++){
            ans+=Math.abs(cur-requests[i]);
            cur = requests[i];
        }
        return ans;
    }
}