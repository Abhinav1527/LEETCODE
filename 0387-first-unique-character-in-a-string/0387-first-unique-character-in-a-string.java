class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        int[] firstIdx = new int[26];
        Arrays.fill(firstIdx,-1);
        int minIdx = n;

        for(int i=0;i<n;i++) {

            int idx = s.charAt(i)-'a';
            if(firstIdx[idx] == -1) {
                firstIdx[idx] = i;
            }
        }
        for(int i=0;i<n;i++) {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<n;i++) {
            if(hm.get(s.charAt(i)) == 1) {
                minIdx = Math.min(minIdx,firstIdx[s.charAt(i)-'a']);
            }
        }
        return minIdx == n ? -1 : minIdx;
    }
}