/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ListNode temp = head;
        ListNode prev = null;
        int idx = 0;
        List<Integer> l = new ArrayList<>();
        while(temp.next!=null){
            if(prev != null){
                if((prev.val<temp.val && temp.val>temp.next.val) || (prev.val>temp.val && temp.val<temp.next.val)){
                    l.add(idx);
                }
            }
            idx++;
            prev = temp;
            temp = temp.next;
        }
        if(l.size()<2){
            return ans = new int[]{-1,-1};
        }
        ans[1] = l.get(l.size()-1) - l.get(0);
        ans[0] = Integer.MAX_VALUE;

        for(int i=1;i<l.size();i++){
            ans[0] = Math.min(ans[0],l.get(i) - l.get(i-1));
        }
        return ans;
    }
}