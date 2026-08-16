class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int ans = Integer.MAX_VALUE;
        int x = target[0];
        int y = target[1];
        int sum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x1 = drones[i][0];
            int y1 = drones[i][1];
            int range = drones[i][2];

            int dis = Math.abs(x1-x) + Math.abs(y1-y);
            if(dis<=range){
                if(dis<sum){
                    ans = i;
                    sum = dis;
                }
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }
}