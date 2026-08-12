class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length; 
        Map<Integer,Integer> mp = new HashMap<>();
        int maxlen = 0;
        int i=0;
        int j=0;
        while(j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.get(nums[i])-1);
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}