class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        int res = 0;
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }
        return 0;
    }
}