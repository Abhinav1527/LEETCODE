class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        
        for(int i=0;i<n;i++) {
            if(vis[i]) continue;

            int[] f1 = new int[26];
            for(char c : strs[i].toCharArray()) {
                f1[c-'a']++;
            }
            List<String> temp = new ArrayList<>();
            for(int j=i;j<n;j++) {
                if(vis[j]) continue;

                int[] f2 = new int[26];
                for(char c : strs[j].toCharArray()) {
                    f2[c-'a']++;
                }
                boolean valid = true;
                for(int k=0;k<26;k++) {
                    if(f1[k]!=f2[k]) {
                        valid = false;
                        break;
                    }
                }
                if(valid) {
                    temp.add(strs[j]);
                    vis[j] = true;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}