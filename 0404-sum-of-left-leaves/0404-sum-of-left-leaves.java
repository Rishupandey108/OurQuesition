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
    int result =0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        int result =0;

        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr.left!=null && curr.left.left==null && curr.left.right==null){
                result+=curr.left.val;
            }

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }


        return result;
    }
}