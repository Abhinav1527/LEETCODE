class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] sorted = new Integer[n];
        for(int i=0;i<n;i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted, (a,b) -> {
            if(digitSum(a) != digitSum(b)) {
                return digitSum(a) - digitSum(b);
            }
            return a-b;
        });

        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            hm.put(sorted[i],i);
        }

        boolean[] vis = new boolean[n];
        int swaps = 0;

        for(int i=0;i<n;i++) {

            if(vis[i]) {
                continue;
            }

            int j = i;
            int count = 0;
            while(!vis[j]) {
                vis[j] = true;
                count++;

                j = hm.get(nums[j]);
            }

            swaps += count-1;
        }
        return swaps;
    }
    public int digitSum(int num) {
        int sum = 0;
        while(num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}