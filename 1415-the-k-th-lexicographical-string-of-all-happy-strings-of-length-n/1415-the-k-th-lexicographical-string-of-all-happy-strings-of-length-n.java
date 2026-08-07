class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        pick(n,ans,"");

        if(k>ans.size()){
            return "";
        }else{
            return ans.get(k-1);
        }
    }
    public void pick(int n,List<String> ans,String s){
        if(s.length() == n){
            ans.add(s);
            return;
        }
        for(char c='a';c<='c';c++){
            if(s.isEmpty() || s.charAt(s.length()-1) != c)
            pick(n,ans,s+c);
        }
    }
}