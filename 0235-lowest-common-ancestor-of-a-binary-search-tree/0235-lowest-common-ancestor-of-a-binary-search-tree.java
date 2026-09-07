/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        return findAncestor(root,p,q);
        
    }

    public TreeNode findAncestor(TreeNode root , TreeNode p , TreeNode q){

            if(root.val==p.val){
                return root;
            }
         if(p.val>root.val && q.val>root.val){
            return findAncestor(root.right,p,q);
        }

        if(p.val<root.val && q.val<root.val){
            return findAncestor(root.left,p,q);
        }

        if(p.val<root.val && q.val>root.val){
            return root;
        }

        return root;
    }
}