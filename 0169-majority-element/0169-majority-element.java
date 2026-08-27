class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c = 0;
        int e = 0;

        for(int i=0;i<n;i++){
            if(c == 0){
                c = 1;
                e = nums[i];
            }else if(e == nums[i]){
                c++;
            }else{
                c--;
            }
        }
        int ans = 0;
        c = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == e){
                c++;
            }
        }

        if(c>(n/2)) ans = e;

        return ans;
    }
}