class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int min = 101;
        int max = 0;
        boolean[] vis = new boolean[101];
        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            vis[nums[i]] = true;
        }
        for(int i=min;i<=max;i++){
            if(!vis[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}