class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long ans = 1;
        res.add((int)ans);
        for(int i=1;i<=rowIndex;i++){
            ans *= (rowIndex-i+1);
            ans /= i;

            res.add((int)ans);
        }
        return res;
    }
}