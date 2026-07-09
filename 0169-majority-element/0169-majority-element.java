class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        int res = 0;
        int maj = 0;
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);
            if(m.get(num)>maj){
                res = num;
                maj = m.get(num);
            }
        }
        return res;
    }
}