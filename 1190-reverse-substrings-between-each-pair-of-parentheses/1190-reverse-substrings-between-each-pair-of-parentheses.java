class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '(') {
                st.push(sb.length());
            }else if(s.charAt(i) == ')') {
                int start = st.pop();
                reverse(sb,start,sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public void reverse(StringBuilder sb,int start,int end) {
        while(start<end) {
            char t = sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,t);
        }
    }
}