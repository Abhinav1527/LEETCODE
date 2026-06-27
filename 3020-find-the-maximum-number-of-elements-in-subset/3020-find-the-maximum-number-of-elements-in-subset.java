import java.util.HashMap;

class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int ans = 1;
        
        if (freq.containsKey(1)) {
            int cnt = freq.get(1);
            if (cnt % 2 == 0) {
                ans = cnt - 1;
            } else {
                ans = cnt;
            }
        }

        for (int i : freq.keySet()) {
            if (i == 1) {
                continue;
            }

            long cur = i;
            int len = 0;

            while (true) {
                int cnt = freq.getOrDefault((int) cur, 0);

                if (cnt >= 2) {
                    len += 2;

                    if (cur > 1000000000L / cur) {
                        len--;
                        break;
                    }

                    cur = cur * cur;
                } else if (cnt == 1) {
                    len++;
                    break;
                } else {
                    if (len > 0) {
                        len--;
                    }
                    break;
                }
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}