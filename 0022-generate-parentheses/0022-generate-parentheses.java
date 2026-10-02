class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n,"",0,0,ans);
        return ans;
    }
    public void solve(int n,String s,int op,int cp,List<String> ans) {
        if(op + cp == 2*n) {
            ans.add(s);
            return;
        }
        if(op < n) {
            solve(n,s+"(",op+1,cp,ans);
        }
        if(cp<op) {
            solve(n,s+")",op,cp+1,ans);
        }
    }
}