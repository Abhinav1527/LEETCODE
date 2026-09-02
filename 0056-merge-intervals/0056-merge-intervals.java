class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end = Math.max(end,intervals[i][1]);
            }else{
                ans.add(Arrays.asList(start,end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        ans.add(Arrays.asList(start,end));

        int[][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;
    }
}