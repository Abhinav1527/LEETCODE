class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gen(n,0,0,"",ans);
        return ans;
    }
    public void gen(int n,int oc,int cc,String s,List<String> ans){
        if(oc+cc == 2*n){
            ans.add(s);
            return;
        }
        if(oc<n){
            gen(n,oc+1,cc,s+"(",ans);
        }
        if(cc<oc){
            gen(n,oc,cc+1,s+")",ans);
        }
    }
}