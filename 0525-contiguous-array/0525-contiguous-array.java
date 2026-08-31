class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int maxLen = 0;
        int sum = 0;
        int zerocnt = 0;
        int onecnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zerocnt++;
            }else{
                onecnt++;
            }
            int diff = zerocnt - onecnt;
            if(hm.containsKey(diff)){
                maxLen = Math.max(maxLen,i-hm.get(diff));
            }else{
                hm.put(diff,i);
            }
        }
        return maxLen;
    }
}