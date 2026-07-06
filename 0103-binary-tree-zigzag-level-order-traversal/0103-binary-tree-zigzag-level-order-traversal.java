/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToright = true;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<s;i++){
                TreeNode cur = q.poll();
                if(leftToright){
                    list.addLast(cur.val);
                }else{
                    list.addFirst(cur.val);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            l.add(list);

            leftToright = !leftToright;
        }
        return l;
    }
}