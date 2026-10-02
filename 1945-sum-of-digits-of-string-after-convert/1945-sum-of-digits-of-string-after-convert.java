class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        String res = "";
        for(int i=0;i<n;i++) {
            res += String.valueOf(s.charAt(i) - 96);
        }

        int num = 0;
        for(int i=0;i<res.length();i++) {
            num += res.charAt(i) - '0';
        }
        if(k == 1) {
            return num;
        }

        int temp = 0;
        while(k-->1) {
            while(num>0) {
                temp += num % 10;
                num /= 10; 
            }
            num = temp;
            temp = 0;
        }
        return num;
    }
}