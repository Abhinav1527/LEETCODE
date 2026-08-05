class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        pick(nums,n,0,new ArrayList<>(),ans);
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<Integer> l,List<List<Integer>> ans){
        ans.add(new ArrayList<>(l));
        for(int i=idx;i<n;i++){
            l.add(nums[i]);
            pick(nums,n,i+1,l,ans);
            l.remove(l.size()-1);
        }
    }
}