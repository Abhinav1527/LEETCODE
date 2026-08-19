class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 1;
        int start = 0;
        for(int i=0;i<n;i++){
            int len1 = expand(s,i-1,i+1);  //odd
            int len2 = expand(s,i,i+1);    //even
            int len = Math.max(len1,len2);
            if(len>maxlen){
                maxlen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxlen);
    }
    public int expand(String s,int left,int right){
        int res = 1;
        while(left>=0 && right<s.length()){
            if(s.charAt(left) == s.charAt(right)){
                res = Math.max(res,right-left+1);
                left--;
                right++;
            }else{
                break;
            }
        }
        return res;
    }
}