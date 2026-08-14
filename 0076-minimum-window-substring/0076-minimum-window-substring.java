class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] freqT = new int[128];
        for(int i=0;i<m;i++){
            freqT[t.charAt(i)]++;
        }
        int i = 0;
        int[] freqS = new int[128];
        int minlen = Integer.MAX_VALUE;
        String res = "";
        for(int j=0;j<n;j++){
            freqS[s.charAt(j)]++;
            while(isValid(freqS,freqT)){
                if(minlen>j-i+1){
                res = s.substring(i,j+1);
                minlen = j-i+1;
                }
                freqS[s.charAt(i)]--;
                i++;
            }
        }
        return res;
    }
    public boolean isValid(int[] f1,int[] f2){
        for(int i=0;i<128;i++){
            if(f1[i]<f2[i]){
                return false;
            }
        }
        return true;
    }
}