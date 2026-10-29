class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int m = pref.length();

        int count = 0;

        for(int i=0;i<n;i++) {
            int j = 0;
            for(j=0;j<m;j++) {
                if(words[i].length()<m) {
                    break;
                }
                if(words[i].charAt(j) != pref.charAt(j)) {
                    break;
                }
            }
            if(j==m) {
                count++;
            }
        }
        return count;
    }
}