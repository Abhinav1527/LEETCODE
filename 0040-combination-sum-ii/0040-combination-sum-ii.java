class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        pick(nums,nums.length,0,target,ans,new ArrayList<>());
        return ans;
    }
    public void pick(int[] nums,int n,int idx,int target,List<List<Integer>> ans,List<Integer> l){
            if(target == 0){
                ans.add(new ArrayList<>(l));
                return;
            }
        for(int i=idx;i<n;i++){
            if(i>idx && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            l.add(nums[i]);
            pick(nums,n,i+1,target-nums[i],ans,l);
            l.remove(l.size()-1);
        }
    }
}