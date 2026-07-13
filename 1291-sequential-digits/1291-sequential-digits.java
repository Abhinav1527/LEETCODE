class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";
        for(int i=2;i<=9;i++){
            for(int j=0;j<=9-i;j++){
                int n = Integer.parseInt(s.substring(j,j+i));
                if(n>=low && n<=high){
                    list.add(n);
                }
            }
        }
        return list;
    }
}