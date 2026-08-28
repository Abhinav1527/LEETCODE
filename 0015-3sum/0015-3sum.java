class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++){
                if(hs.contains(-(nums[i]+nums[j]))){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(-(nums[i]+nums[j]));
                    Collections.sort(l);
                    res.add(l);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
