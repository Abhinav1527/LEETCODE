class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;
      int el = 0;
      int cnt = 0;
      for(int i=0;i<n;i++){
        if(cnt == 0){
            cnt = 1;
            el = nums[i];
        }else if(nums[i] == el){
            cnt++;
        }else{
            cnt--;
        }
      }
      int c = 0;
      for(int i=0;i<n;i++){
        if(nums[i] == el){
            c++;
        }
      }
      if(c>n/2){
        return el;
      }

      return 0;
    }
}