class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        help(nums,n,new ArrayList<>(),ans,vis);
        return ans;
    }
    public void help(int[] nums,int n,List<Integer> l,List<List<Integer>> ans,boolean[] vis){
        if(l.size() == n){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1] && !vis[i-1]) continue;
            if(!vis[i]){
                vis[i] = true;
                l.add(nums[i]);
                help(nums,n,l,ans,vis);
                l.remove(l.size()-1);
                vis[i] = false;
            }
        }
    }
}