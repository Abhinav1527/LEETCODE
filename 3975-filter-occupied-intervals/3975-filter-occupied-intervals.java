class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b) -> a[0] - b[0]);
        List<List<Integer>> l = new ArrayList<>();

        int start = occupiedIntervals[0][0];
        int end = occupiedIntervals[0][1];
        for(int i=0;i<occupiedIntervals.length;i++){
            if(occupiedIntervals[i][0] <= end+1){
                end = Math.max(end,occupiedIntervals[i][1]);
            }else{
                addInterval(l,start,end,freeStart,freeEnd);
                start = occupiedIntervals[i][0];
                end = occupiedIntervals[i][1];
            }
        }
        addInterval(l,start,end,freeStart,freeEnd);
        return l;
    }
    private void addInterval(List<List<Integer>> l,int s,int e,int fs,int fe){
        if(e<fs || s>fe){
            l.add(Arrays.asList(s,e));
        }else{
            if(s<fs){
                l.add(Arrays.asList(s,fs-1));
            }
            if(e>fe){
                l.add(Arrays.asList(fe+1,e));
            }
        }
    }
}