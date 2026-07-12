class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        Map<Integer,Integer> hm = new HashMap<>(); 
        int rank = 1;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(temp[i])){
                hm.put(temp[i],rank++);
            }
        }
        int[] nums = new int[n];
        for(int k=0;k<n;k++){
            nums[k] = hm.get(arr[k]);
        }
        return nums;
    }
}