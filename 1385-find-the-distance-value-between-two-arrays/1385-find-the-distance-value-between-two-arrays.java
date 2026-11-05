class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
            int l = 0;
            int r = arr2.length-1;
            boolean found = false;
            while(l<=r)
            {
                int mid = l+(r-l)/2;
                if(Math.abs(arr1[i] - arr2[mid]) <= d)
                {
                    found = true;
                    break;
                }else if(arr2[mid]<arr1[i]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            if(!found)
            {
                count++;
            }
        }
        return count;
    }
}