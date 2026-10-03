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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(root,targetSum,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(TreeNode root,int targetSum ,List<Integer> l,List<List<Integer>> ans) {
        if(root == null) {
            return;
        }
        l.add(root.val);
        targetSum -= root.val;
        if(root.left == null && root.right == null) {
            if(targetSum == 0) {
                ans.add(new ArrayList<>(l));
            }
        }
        solve(root.left,targetSum,l,ans);
        solve(root.right,targetSum,l,ans);

        l.remove(l.size()-1);
    }
}