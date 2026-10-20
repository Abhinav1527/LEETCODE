class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] f1 = new boolean[26];
        for(char c : allowed.toCharArray()) {
            f1[c-'a'] = true;
        }

        int n = words.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            boolean[] f2 = new boolean[26];
            String s = words[i];
            for(int c : s.toCharArray()) {
                f2[c-'a'] = true;
            }
            boolean found = true;
            for(int j=0;j<26;j++) {
                if(!f1[j] && f2[j]) {
                    found = false;
                    break;
                }
            }
            if(found) {
                count++;
            }
        }
        return count;
    }
}