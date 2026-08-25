class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(genRow(i));
        }
        return ans;
    }
    public List<Integer> genRow(int n){
        List<Integer> l = new ArrayList<>();
        int ans = 1;
        l.add(ans);
        for(int i=1;i<n;i++){
            ans *= n-i;
            ans /= i;

            l.add(ans);
        }
        return l;
    }
}