class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        pick(n,1,new ArrayList<>(),ans,k);
        return ans;
    }
    public void pick(int n,int idx,List<Integer> l,List<List<Integer>> ans,int k){
        if(k==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<=n;i++){
            l.add(i);
            pick(n,i+1,l,ans,k-1);
            l.remove(l.size()-1);
        }
    }
}