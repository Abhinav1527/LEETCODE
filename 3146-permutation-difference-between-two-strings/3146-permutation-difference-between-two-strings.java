class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i=0;i<s.length();i++) {
            f1[s.charAt(i)-'a'] = i;
        } 

        for(int i=0;i<t.length();i++) {
            f2[t.charAt(i)-'a'] = i;
        }

        int diff = 0;
        for(int i=0;i<26;i++) {
            diff += Math.abs(f1[i]-f2[i]);
        }

        return diff;
    }
}