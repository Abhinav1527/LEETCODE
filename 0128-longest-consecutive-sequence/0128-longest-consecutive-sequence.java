class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int longest = 1;
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int x : hs){
            if(!hs.contains(x-1)){
                int cnt = 1;
                int num = x;

                while(hs.contains(num+1)){
                    cnt += 1;
                    num += 1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}