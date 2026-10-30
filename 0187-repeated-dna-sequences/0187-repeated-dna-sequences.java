class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        HashSet<String> hs = new HashSet<>();
        HashSet<String> sol = new HashSet<>();
        List<String> ans = new ArrayList<>();

        for(int i=0;i<=n-10;i++) {
            String temp = s.substring(i,i+10);
            if(hs.contains(temp)) {
                sol.add(temp);
            }else{
                hs.add(temp);
            } 
        }
        for(String str : sol) {
            ans.add(str);
        }
        return ans;
    }
}