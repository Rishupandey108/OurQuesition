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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(subRoot==null) return false;

        if(checkSubTreee(root,subRoot)){
            return true;
        }

        if(root.val==subRoot.val){
            checkSubTreee(root,subRoot);
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean checkSubTreee(TreeNode root1,TreeNode root2){

            if(root1==null && root2==null){
                return true;
            }
            if(root1==null || root2==null){
                return false;
            }

            if(root1.val!=root2.val){
                return false;
            }

           return checkSubTreee(root1.left,root2.left)&&checkSubTreee(root1.right,root2.right);
    }
}