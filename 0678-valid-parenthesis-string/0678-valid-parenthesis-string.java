class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int op = 0;
        int cp = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '*') {
                op++;
            }else{
                op--;
            }

            if(s.charAt(n-i-1) == ')' || s.charAt(n-i-1) == '*') {
                cp++;
            }else{
                cp--;
            }

            if(cp<0 || op<0) {
                return false;
            }
        }
        return true;
    }
}