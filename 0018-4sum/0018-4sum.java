class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> st = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> s = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = (long)nums[i]+nums[j]+nums[k];
                    long fourth = (long)target - sum;
                    if(s.contains(fourth)){
                        st.add(Arrays.asList(nums[i],nums[j],nums[k],(int)fourth));
                    }
                    s.add((long)nums[k]);
                }
            }
        }
        for(List x : st){
            ans.add(x);
        }

        return ans;
    }
}