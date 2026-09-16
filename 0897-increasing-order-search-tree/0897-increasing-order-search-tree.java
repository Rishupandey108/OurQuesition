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

    public TreeNode increasingBST(TreeNode root) {
        postOrderTraverse(root);

        TreeNode dummy = null;

        for(int a:lst){
             dummy = CreateTree(dummy,a);   
        }

        return dummy;
    }

    public void postOrderTraverse(TreeNode root){
        if(root==null){
            return;
        }
        postOrderTraverse(root.left);
        lst.add(root.val);
        postOrderTraverse(root.right);
    }

    public TreeNode CreateTree(TreeNode root,int val){

        if(root==null){
            root = new TreeNode(val);

        }else{
            root.right = CreateTree(root.right,val);
        }

        return root;
    }
}