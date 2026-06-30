class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3];
        int count = 0;
        int i=0;
        for(int j=0;j<n;j++){
            char c = s.charAt(j);
            if(c=='a'){
                freq[0]++;
            }else if(c=='b'){
                freq[1]++;
            }else{
                freq[2]++;
            }
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count += n - j;
                char lc = s.charAt(i);
                if(lc == 'a'){
                    freq[0]--;
                }else if(lc == 'b'){
                    freq[1]--;
                }else{
                    freq[2]--;
                }
                i++;
            }
        }
        return count;
    }
}