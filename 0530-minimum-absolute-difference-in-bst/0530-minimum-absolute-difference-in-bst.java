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
     ArrayList<Integer> lst = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        

         Traverse(root);
         Collections.sort(lst);

         int min =Integer.MAX_VALUE;

         for(int i=1;i<lst.size();i++){
             min = Math.min(min,lst.get(i)-lst.get(i-1));
         }

         return min;
    }

    public void Traverse(TreeNode root){
        if(root ==null) return;

        lst.add(root.val);
        Traverse(root.left);
        Traverse(root.right);
    }
}