class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n/2;i++) {
           if(isVowel(s.charAt(i))) {
            c1++;
           }
        }
        for(int i=n/2;i<n;i++) {
           if(isVowel(s.charAt(i))) {
            c2++;
           }
        }

        return c1 == c2;
    }
    public boolean isVowel (char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}