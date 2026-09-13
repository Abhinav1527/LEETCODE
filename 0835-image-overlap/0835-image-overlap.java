class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        List<int[]> ones1 = new ArrayList<>();
        List<int[]> ones2 = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j] == 1){
                    ones1.add(new int[]{i,j});
                }
                if(img2[i][j] == 1){
                    ones2.add(new int[]{i,j});
                }
            }
        }

        int ans = 0;
        Map<String,Integer> hm = new HashMap<>();
        for(int[] a : ones1){
            for(int[] b : ones2){
                int x = b[0] - a[0];
                int y = b[1] - a[1];

                String res = x+","+y;

                hm.put(res,hm.getOrDefault(res,0)+1);
                ans = Math.max(ans,hm.get(res));
            }
        }
        return ans;
    }
}