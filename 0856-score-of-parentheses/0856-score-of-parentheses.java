class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int score = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                st.push(0);
            }else {
                int innerscore = st.pop();
                if(innerscore == 0) {
                    score = 1;
                }else{
                    score = 2*innerscore;
                }
                st.set(st.size()-1,st.peek()+score);
            }
        }
        return st.pop();
    }
}