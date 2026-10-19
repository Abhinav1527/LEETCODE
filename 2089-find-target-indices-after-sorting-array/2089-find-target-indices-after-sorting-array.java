class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int small = 0;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] < target) {
                small++;
            }else if(nums[i] == target) {
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(count > 0) {
            ans.add(small++);
            count--;
        }
        return ans;
    }
}