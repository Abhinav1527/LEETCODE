class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        int n = s.length();
        int m = knowledge.size();

        Map<String,String> hm = new HashMap<>();
        for(int i=0;i<m;i++) {
            hm.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<n) {
            if(s.charAt(i) == '(') {
                int j = i+1;
                while(j<n && s.charAt(j) != ')'){
                    j++;
                }
                String str = s.substring(i+1,j);
                if(hm.containsKey(str)) {
                    sb.append(hm.get(str));
                }else{
                    sb.append("?");
                }
                i = j+1;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}