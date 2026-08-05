class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        pick(nums,n,new ArrayList<>(),ans,vis);
        return ans;
    }
    public void pick(int[] nums,int n,List<Integer> l,List<List<Integer>> ans,boolean[] vis){
        if(l.size() == n){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i] = true;
                l.add(nums[i]);
                pick(nums,n,l,ans,vis);
                l.remove(l.size()-1);
                vis[i] = false;
            }
        }
    }
}