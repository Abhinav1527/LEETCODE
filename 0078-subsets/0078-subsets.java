class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        pick(nums,n,0,new ArrayList<>(),ans);
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<Integer> l,List<List<Integer>> ans){
        if(idx == n){
            ans.add(new ArrayList<>(l));
            return;
        }
            l.add(nums[idx]);
            pick(nums,n,idx+1,l,ans);
            l.remove(l.size()-1);
            pick(nums,n,idx+1,l,ans);
    }
}