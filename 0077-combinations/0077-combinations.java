class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = i+1;
        }
        pick(nums,n,0,new ArrayList<>(),ans,k);
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<Integer> l,List<List<Integer>> ans,int k){
        if(l.size() == k){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<n;i++){
            l.add(nums[i]);
            pick(nums,n,i+1,l,ans,k);
            l.remove(l.size()-1);
        }
    }
}