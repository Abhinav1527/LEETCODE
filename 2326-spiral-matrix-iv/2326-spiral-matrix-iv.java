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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        for (int[] arr : mat) {
            Arrays.fill(arr, -1);
        }
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        ListNode cur = head;

        while (cur != null && left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                if (cur != null) {
                    mat[top][i] = cur.val;
                    cur = cur.next;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if (cur != null) {
                    mat[i][right] = cur.val;
                    cur = cur.next;
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (cur != null) {
                        mat[bottom][i] = cur.val;
                        cur = cur.next;
                    }
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (cur != null) {
                        mat[i][left] = cur.val;
                        cur = cur.next;
                    }
                }
            }
            left++;
        }
        return mat;
    }
}