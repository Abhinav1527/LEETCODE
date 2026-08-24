class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            sum += nums[i];
            int target = sum%k;
            if(hm.containsKey(target)){
                if(i - hm.get(target) >= 2){
                    return true;
                }
            }else{
                hm.put(target,i);
            }
        }
        return false;
    }
}