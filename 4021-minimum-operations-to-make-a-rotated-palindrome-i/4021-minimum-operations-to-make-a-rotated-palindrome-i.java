class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cost = i;
            for(int j=0;j<n/2;j++){
                char a = s.charAt((i+j)%n);
                char b = s.charAt((n-1-j+i)%n);

                int diff = Math.abs(a-b);

                cost += Math.min(diff,26-diff);
            }
            ans = Math.min(ans,cost);
        }
        return ans;
    }
}