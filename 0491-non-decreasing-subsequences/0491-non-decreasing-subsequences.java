class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        pick(nums,n,0,new ArrayList<>(),ans);
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<Integer> l,List<List<Integer>> ans){
            if(l.size()>=2){
            ans.add(new ArrayList<>(l));
            }
        boolean[] vis = new boolean[201];
        for(int i=idx;i<n;i++){
            if(vis[nums[i]+100]) continue;
            if(l.isEmpty() || nums[i]>=l.get(l.size()-1)){
                vis[nums[i]+100] = true;
                l.add(nums[i]);
                pick(nums,n,i+1,l,ans);
                l.remove(l.size()-1);
            }
        }
    }
}