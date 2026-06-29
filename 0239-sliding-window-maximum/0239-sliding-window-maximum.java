class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                l.add(nums[q.peekFirst()]);
            }
        }
        int[] ans = new int[l.size()];
        int idx = 0;
        for(int x : l){
            ans[idx++] = x;
        }
        return ans;
    }
}