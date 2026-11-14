class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            int num = target - nums[i];
            if(hm.containsKey(num)) {
                return new int[]{i,hm.get(num)};
            }
            hm.put(nums[i],i);
        }
        return new int[] {};
    }
}