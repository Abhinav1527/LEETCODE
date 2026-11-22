class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while(n>0) {
            int num = n%10;
            digitSum += num;
            squareSum += num*num;
            n /= 10;
        }

        return squareSum - digitSum >= 50;
    }
}