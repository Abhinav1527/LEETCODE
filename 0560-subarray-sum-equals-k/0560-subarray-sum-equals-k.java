class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            int val = sum - k;

            if(hm.containsKey(val)){
                cnt += hm.get(val);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}