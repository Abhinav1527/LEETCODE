class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int num1 = nums[0];
        int num2 = nums[1];

        int[] res = new int[n];
        int[] res2 = new int[n];

        res[0] = num1;
        res2[0] = num2;
        int idx = 1;
        int idx2 = 1;

        for(int i=2;i<n;i++){
            if(num1>num2){
                res[idx++] = nums[i];
                num1 = nums[i];
            }else{
                res2[idx2++] = nums[i];
                num2 = nums[i];
            }
        }
        for(int i=0;i<idx2;i++){
            res[idx++] = res2[i];
        }

        return res;
    }
}