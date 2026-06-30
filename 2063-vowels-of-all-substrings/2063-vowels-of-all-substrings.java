class Solution {
    public long countVowels(String word) {
        int n = word.length();
        long count = 0;
        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count += (long)(i+1)*(long)(n-i);
            }
        }
        return count;
    }
}