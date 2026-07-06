class Solution {
    public void reverseString(char[] s) {
        swap(0,s.length,s);
    }
    public void swap(int i,int n,char[] s){
        if(i>=n/2){
            return;
        }
        char t = s[i];
        s[i] = s[n-i-1];
        s[n-i-1] = t;

        swap(i+1,n,s);
    }
}