class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        int n = names.length;

        for(int i=0;i<n;i++) {
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans = new String[n];
        int idx = 0;
        for(int i=n-1;i>=0;i--) {
            ans[idx++] = hm.get(heights[i]);
        }
        return ans;
    }
}