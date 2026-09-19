class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        Map<String,Integer> hm = new HashMap<>();
        List<String> l = new ArrayList<>();
        for(String s : words){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String> ans = new ArrayList<>(hm.keySet());

        Collections.sort(ans,(a,b) -> {
            if(hm.get(a).equals(hm.get(b))){
                return a.compareTo(b);
            }
            return hm.get(b) - hm.get(a);
        });

        for(int i=0;i<k;i++){
            l.add(ans.get(i));
        }
        return l;
    }
}