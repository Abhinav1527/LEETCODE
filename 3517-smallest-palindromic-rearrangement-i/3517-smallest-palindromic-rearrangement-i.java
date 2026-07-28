class Solution {
    public String smallestPalindrome(String s) {

        int n = s.length();
        int[] freq = new int[26];

        for(int i=0;i<n>>1;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }

        int i = 0;
        int j = n-1;

        char[] res = s.toCharArray();
        for(int k=0;k<26;k++){
            while(freq[k]-->0){
                res[i++] = (char)('a'+k);
                res[j--] = (char)('a'+k);
            }
        }
        return new String(res);
    }
}