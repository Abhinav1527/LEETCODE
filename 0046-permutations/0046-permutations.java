class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        help(nums,n,0,ans);
        return ans;
    }
    public void help(int[] nums,int n,int idx,List<List<Integer>> ans){
        if(idx == n){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(nums[i]);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            help(nums,n,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}