class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            freq[c-'a']++;
        }
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add(freq[i]);
            }
        }
        int k = 1;
        int ans = 0;
        while(!pq.isEmpty()){
            int x = pq.poll();
            if(k<=8){
                ans += x*1;
            }else if(k>8 && k<=16){
                ans += x*2;
            }else if(k>16 && k<=24){
                ans += x*3;
            }else{
                ans += x*4;
            }
            k++;
            //System.out.print(x+" ");
        }
        return ans;
    }
}