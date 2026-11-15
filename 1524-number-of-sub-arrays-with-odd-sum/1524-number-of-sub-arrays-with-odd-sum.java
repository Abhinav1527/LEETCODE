class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int odd = 0;
        int even = 1;
        int count = 0;
        int prefixSum = 0;

        for(int i=0;i<n;i++) {
            prefixSum += arr[i];

            if(prefixSum%2==0) {
                count += odd;
                even++;
            }else{
                count += even;
                odd++;
            }
            count %= mod;
        }

        return count;
    }
}