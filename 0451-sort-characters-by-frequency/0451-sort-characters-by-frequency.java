class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] freq = new int[62];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                freq[c-'a']++;
            }else if(c>='A' && c<='Z'){
                freq[26+(c-'A')]++;
            }else{
                freq[52+(c-'0')]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            int maxidx = -1;
            int maxfreq = 0;
            for(int i=0;i<62;i++){
                if(freq[i] > maxfreq){
                    maxfreq = freq[i];
                    maxidx = i;
                }
            }
            if(maxidx == -1) break;

            char ch;
            if(maxidx<26){
                ch = (char)('a'+maxidx);
            }else if(maxidx<52){
                ch = (char)('A'+(maxidx-26));
            }else{
                ch = (char)('0'+(maxidx-52));
            }

            while(maxfreq-->0){
                sb.append(ch);
            }
            freq[maxidx] = 0;
        }
        return sb.toString();
    }
}