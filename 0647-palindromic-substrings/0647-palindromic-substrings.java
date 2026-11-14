class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            count += expand(s,i,i); //odd

            count += expand(s,i,i+1); //even
        }
        return count;
    }
    public int expand(String s,int left,int right) {
        int c = 0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            c++;
            left--;
            right++;
        }
        return c;
    }
}