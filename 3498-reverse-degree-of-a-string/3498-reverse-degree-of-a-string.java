class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int product = 0;
        for(int i=0;i<n;i++){
            int val = 'z' - s.charAt(i) + 1;
            product += (val*(i+1));
        }
        return product;
    }
}