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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return BuildBinaryTree(nums,0,nums.length-1);
    }

    public static TreeNode BuildBinaryTree(int[]num,int left,int right){
        if(left>right){
            return null;
        }

        int maxind =left;

        for(int i=left;i<=right;i++){
            if(num[i]>num[maxind]){
                maxind = i;
            }
        }

       TreeNode root = new TreeNode(num[maxind]);

        root.left = BuildBinaryTree(num,left,maxind-1);

        root.right = BuildBinaryTree(num,maxind+1,right);

        return root;
    }
}