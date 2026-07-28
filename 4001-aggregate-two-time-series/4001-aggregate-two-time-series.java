class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> l = new ArrayList<>();
        int n = series1.length;
        int m = series2.length;

        int i = 0;
        int j = 0;

        while(i<n || j<m){
            int t = 0;
            if(i == n){
                t = series2[j][0];
            }else if(j==m){
                t = series1[i][0];
            }else{
                t = Math.min(series1[i][0],series2[j][0]);
            }

            int val1 = 0;
            int val2 = 0;

            if(i<n){
                val1 = series1[i][1];
            }
            if(j<m){
                val2 = series2[j][1];
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(t);
            temp.add(val1+val2);

            l.add(temp);

            if(i<n && series1[i][0] == t){
                i++;
            }
            if(j<m && series2[j][0] == t){
                j++;
            }
        }
        return l;
    }
}