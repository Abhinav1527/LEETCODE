class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int n = arrivalTime.length;
        int m = lights.length;

        int maxLight = 0;
        for(int i=0;i<m;i++){
            maxLight = Math.max(maxLight,lights[i]);
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            int r = arrivalTime[i]%period;
            int penalty = (r<maxLight) ? 0 : period-r;

            ans = Math.max(ans,penalty);
        }

        return ans;
    }
}