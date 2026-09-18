class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int q = queries.length;

        int[] ans = new int[q];
        int[] prefix = new int[n];
        int presum = 0;
        for(int i=0;i<n;i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                presum += 1;
            }
            prefix[i] = presum;
        }

        for(int i=0;i<q;i++){
            int l = queries[i][0];
            int r = queries[i][1];

            int res = 0;
            if(l==0){
                res = prefix[r];
            }else{
                res = prefix[r] - prefix[l-1];
            }

            ans[i] = res;
        }

        return ans;
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}