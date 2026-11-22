class Solution {
    public boolean checkString(String s) {
        int maxA = Integer.MIN_VALUE;
        int minB = Integer.MAX_VALUE;

        int n = s.length();
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(c == 'a') {
                maxA = Math.max(maxA,i);
            }else{
                minB = Math.min(minB,i);
            }
        }

        return maxA<minB;
    }
}