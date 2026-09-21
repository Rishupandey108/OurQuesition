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
    long small1 = Long.MAX_VALUE;
    long small2 = Long.MIN_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        
         if(root!=null){

            if(root.val<small1){
                small2 = small1;
                small1 = root.val;
            }else if(root.val>small1 && root.val<small2){
                 
                small2 = root.val;
                
            }

            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);
         }

         return  small2==Long.MAX_VALUE?-1:(int)small2;
    }
}