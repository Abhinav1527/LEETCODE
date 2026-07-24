class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        Set<Integer> l = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                l.add(nums[i]^nums[j]);
            }
        }

        boolean[] seen = new boolean[2048];
        for(int x : l){
            for(int y : nums){
                seen[x^y] = true;
            }
        }
        int ans = 0;
        for(boolean b : seen){
            if(b) ans++;
        }
        return ans;
    }
}