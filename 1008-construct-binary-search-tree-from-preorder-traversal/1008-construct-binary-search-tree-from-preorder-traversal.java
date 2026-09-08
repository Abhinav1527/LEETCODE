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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        int n = preorder.length;

        for(int i=0;i<n;i++){
            root = BST(root,preorder[i]);
        }
        return root;
    }
    public TreeNode BST(TreeNode root,int x){
        if(root == null){
            return new TreeNode(x);
        }
        if(root.val>x){
            root.left = BST(root.left,x);
        }else{
            root.right = BST(root.right,x);
        }
        return root;
    }
}