class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n = nums.length;
        long cnt = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
            int tar = 0^xor;
            if(hm.containsKey(tar)){
                cnt += hm.get(tar);
            }
            hm.put(tar,hm.getOrDefault(tar,0)+1);
        }
        return cnt;
    }
}