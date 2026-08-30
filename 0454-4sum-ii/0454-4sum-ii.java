class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int x : nums1){
            for(int y : nums2){
                hm.put(x+y,hm.getOrDefault(x+y,0)+1);
            }
        }

        int count = 0;
        for(int x : nums3){
            for(int y : nums4){
                count += hm.getOrDefault(-(x+y),0);
            }
        }
        return count;
    }
}