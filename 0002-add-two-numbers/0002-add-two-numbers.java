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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int c = 0;
        while(p1!=null && p2!=null){
            int s = p1.val + p2.val+c;
            int rem = s%10;
            c = s/10;
            temp.next = new ListNode(rem);
            p1 = p1.next;
            p2 = p2.next;
            temp = temp.next;
        }
        while(p1!=null){
            int s = p1.val+c;
            int rem = s%10;
            c = s/10;
            temp.next = new ListNode(rem);
            p1 = p1.next;
            temp = temp.next;
        }
        while(p2!=null){
            int s = p2.val+c;
            int rem = s%10;
            c = s/10;
            temp.next = new ListNode(rem);
            p2 = p2.next;
            temp = temp.next;
        }
        if(c > 0){
            temp.next = new ListNode(c);
        }
        return dummy.next;
    }
}