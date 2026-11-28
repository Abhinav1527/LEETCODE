class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int cp = 0;
        int cs = 0;
        if(boxes.charAt(0) == '1') cp++;
        if(boxes.charAt(n-1) == '1') cs++;

        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1] + cp;
            if(boxes.charAt(i) == '1') cp++;
            suffix[n-1-i] = suffix[n-i] + cs;
            if(boxes.charAt(n-1-i) == '1') cs++;
        }

        for(int i=0;i<n;i++) {
            prefix[i] += suffix[i];
        }
        return prefix;
    }
}