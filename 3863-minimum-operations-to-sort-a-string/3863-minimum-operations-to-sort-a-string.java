class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean isSorted = true;
        for(int i=1;i<n;i++) {
            if(s.charAt(i-1) > s.charAt(i)) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            return 0;
        }

        if(n==2) {
            return -1;
        }

        char mn = s.charAt(0);
        char mx = s.charAt(1);

        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(c>mx) {
                mx = c;
            }

            if(c<mn) {
                mn = c;
            }
        }

        if(mn == s.charAt(0) || mx == s.charAt(n-1)) {
            return 1;
        }

        for(int i=1;i<n-1;i++) {
            char c = s.charAt(i);
            if(mn == c || mx == c) {
                return 2;
            }
        }

        return 3;
    }
}