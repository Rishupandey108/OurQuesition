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
     TreeNode dummy=null;
    public void flatten(TreeNode root) {
         
         addright(root);

    }

    public void addright(TreeNode root){
        if(root ==null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if(dummy!=null){
            dummy.right= root;
        }

        root.left=null;
        dummy = root;

        addright(left);
        addright(right);
    }
     
}