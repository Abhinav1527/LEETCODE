class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);


        int num = 0;
        for(int i=0;i<s.length();i++){
            int n = hm.get(s.charAt(i));
            if(i<s.length()-1 && n<hm.get(s.charAt(i+1))){
                num -= n;
            }else{
                num += n;
            }
        }
        return num;
    }
}