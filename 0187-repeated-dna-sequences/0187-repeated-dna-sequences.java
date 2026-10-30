class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        HashSet<String> hs = new HashSet<>();
        HashSet<String> sol = new HashSet<>();

        for(int i=0;i<=n-10;i++) {
            String temp = s.substring(i,i+10);
            if(hs.contains(temp)) {
                sol.add(temp);
            }else{
                hs.add(temp);
            } 
        }
        return new ArrayList<>(sol);
    }
}