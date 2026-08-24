class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];

            int rem = sum%k;

            if(rem<0){
                rem += k;
            }

            count += hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}