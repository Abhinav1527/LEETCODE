class Solution {
    public int minInsertions(String s) {
        int cb = 0;
        int ans = 0;
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(cb % 2 == 1) {
                    ans++;
                    cb--;
                }
                st.push(c);
                cb+=2;
            }else {
                cb--;
                if(cb<0) {
                    ans++;
                    cb = 1;
                }
            }
        }

        return ans + cb;
    }
}