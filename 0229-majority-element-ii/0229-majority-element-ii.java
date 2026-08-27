class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (hm.get(nums[i]) > (n / 3) && !l.contains(nums[i])) {
                l.add(nums[i]);
            }
            if(l.size() == 2) break;
        }
        return l;
    }
}