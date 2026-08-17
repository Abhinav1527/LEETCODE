class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> ans = new ArrayList<>();
        pick(s,0,new ArrayList<>(),ans,n);
        return ans;
    }
    public void pick(String s,int idx,List<String> l,List<List<String>> ans,int n){
        if(idx == n){
            ans.add(new ArrayList<>(l));
            return;
        } 
        for(int i=idx;i<n;i++){
            String str = s.substring(idx,i+1);
            if(isValid(str)){
                l.add(str);
                pick(s,i+1,l,ans,n);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isValid(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i++) != str.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}