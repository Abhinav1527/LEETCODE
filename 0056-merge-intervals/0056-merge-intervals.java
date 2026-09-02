class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;
            while(j<n && intervals[j][0]<=end){
                end = Math.max(end,intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));

            i = j-1;
        }
        int[][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;
    }
}