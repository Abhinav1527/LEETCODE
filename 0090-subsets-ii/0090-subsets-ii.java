class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        pick(nums,n,0,ans,new ArrayList<>());
        return ans;
    }
    public void pick(int[] nums,int n,int idx,List<List<Integer>> ans,List<Integer> l){
        ans.add(new ArrayList<>(l));
        for(int i=idx;i<n;i++){
            if(i>idx && nums[i] == nums[i-1]) continue;
            l.add(nums[i]);
            pick(nums,n,i+1,ans,l);
            l.remove(l.size()-1);
        }
    }
}