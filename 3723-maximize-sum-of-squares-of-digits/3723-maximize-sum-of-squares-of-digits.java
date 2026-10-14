class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int n = sum/9;
        int r = sum%9;
        if(sum>9*num){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            sb.append('9');
        }

        if(r>0) {
            sb.append((char)('0'+r));
        }

        int zeroes = num - sb.length();
        for(int i=0;i<zeroes;i++) {
            sb.append('0');
        }

        return sb.toString();
    }
}