class Solution {
    public int totalNumbers(int[] digits) { 
        int n = digits.length;
        boolean[] vis = new boolean[1001];
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && i!=k){
                        int num = (digits[i]*100)+(digits[j]*10)+digits[k];
                        if(!vis[num] && num > 99 && num%2 == 0){
                            cnt++;
                            vis[num] = true;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}