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
    public int sumNumbers(TreeNode root) {
        sumNumber(root,0);
        return result;
    }

    public void sumNumber(TreeNode root,int path){

           if(root==null) return ;

           path = path*10 + root.val;

           if(root.left==null && root.right==null){
             result +=path;
           }

        sumNumber(root.left,path);
        sumNumber(root.right,path);
    }
}