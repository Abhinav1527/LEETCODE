class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n-1;i++){
            int sum = nums[i] + nums[i+1];
            if(hm.getOrDefault(sum,0) > 0){
                return true;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return false;
    }
}