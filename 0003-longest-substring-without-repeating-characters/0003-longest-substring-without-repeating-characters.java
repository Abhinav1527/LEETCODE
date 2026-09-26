class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> hs = new HashSet<>();
        int maxLen = 0;
        int i = 0;
        for(int j=0;j<n;j++) {
           while(hs.contains(s.charAt(j))){
            hs.remove(s.charAt(i++));
           }
           hs.add(s.charAt(j));
           maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}