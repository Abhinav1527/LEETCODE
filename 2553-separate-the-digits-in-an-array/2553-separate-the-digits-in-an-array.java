class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;

            left++;
            right--;
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            while(num>0){
                l.add(num%10);
                num /= 10;
            }
        }
        Collections.reverse(l);
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}