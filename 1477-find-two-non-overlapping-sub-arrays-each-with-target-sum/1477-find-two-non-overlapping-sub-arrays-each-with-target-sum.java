class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);

        int sum = 0;
        int ans = n+1;
        int minL = n;

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(hm.containsKey(sum-target)){
                int j = hm.get(sum-target);
                int len = i-j;

                if(j==-1){
                    ans = Math.min(ans,len+n);
                }else{
                    ans = Math.min(ans,len+arr[j]);
                }

                minL = Math.min(minL,len);
            }
            arr[i] = minL;
            hm.put(sum,i);
        }

        if(ans == n+1){
            return -1;
        }
        return ans;
    }
}