class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;

        for(int i=0;i<n;i++) {
            boolean[] vis = new boolean[101];
            int c = 0;
            for(int j=i;j<n;j++) {
                int num = nums.get(j);
                if(!vis[num]) {
                    c++;
                    vis[num] = true;
                }
                ans += c*c;
            }
        }
        return ans;
    }
}