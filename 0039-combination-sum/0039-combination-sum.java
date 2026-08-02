class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        pick(nums,n,0,ans,new ArrayList<>(),target);
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<List<Integer>> ans,List<Integer> l,int target){
        if(idx == n){
            if(target == 0){
            ans.add(new ArrayList<>(l));
            }
            return;
        }
        if(nums[idx]<=target){
            l.add(nums[idx]);
            //picking
            pick(nums,n,idx,ans,l,target-nums[idx]);
            l.remove(l.size()-1);
        }
        //not picking
        pick(nums,n,idx+1,ans,l,target);
    }
}