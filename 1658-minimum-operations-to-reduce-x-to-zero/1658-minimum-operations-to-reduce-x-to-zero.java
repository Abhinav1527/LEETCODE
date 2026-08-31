class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int rem = total - x;
        if(rem == 0){
            return n;
        }

        int len = MinLen(nums,n,rem);

        if(len == 0){
            return -1;
        }
        return n - len;
    }
    public int MinLen(int[] nums, int n, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            sum += nums[i];
            int tar = sum - k;
            if(hm.containsKey(tar)){
                maxLen = Math.max(maxLen,i-hm.get(tar));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
}