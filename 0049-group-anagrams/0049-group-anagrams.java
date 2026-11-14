class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!hm.containsKey(s)) {
                hm.put(s,new ArrayList<>());
            }
            hm.get(s).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}