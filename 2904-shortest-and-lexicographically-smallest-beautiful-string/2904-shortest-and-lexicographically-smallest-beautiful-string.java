class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        String ans = "";
        int ones = 0;
        while(j<n){
            if(s.charAt(j) == '1'){
                ones++;
            }

            while(ones>k){
                if(s.charAt(i) == '1'){
                    ones--;
                }
                i++;
            }

            if(ones == k){
                while(i<j && s.charAt(i) == '0'){
                    i++;
                }

                String t = s.substring(i,j+1);

                if(ans.isEmpty() || t.length()<ans.length() || (t.length() == ans.length() && t.compareTo(ans)<0)){
                    ans = t;
                }
            }
            j++;
        }
        return ans;
    }
}