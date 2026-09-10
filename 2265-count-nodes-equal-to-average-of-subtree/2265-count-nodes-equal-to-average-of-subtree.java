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
    public int averageOfSubtree(TreeNode root) {
            if(root==null) return 0;

            CountAndSum(root);
            return result;
    }

    public int[] CountAndSum(TreeNode root){

        if(root==null){
            return new int[]{0,0};
        }

         int s = root.val;
         int c = 1;

        int[] sum  = CountAndSum(root.left);
        int[] count = CountAndSum(root.right);

        s+=sum[0]+count[0];
        c+=sum[1]+count[1];


        if(s/c==root.val){
            result+=1;
        }

        return new int[]{s,c};
        
    }
}