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
      
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> lst = new ArrayList<>();

            findAllPath(root,"",lst);

        return lst;
    }

    public void findAllPath(TreeNode root , String path , List<String> lst){
            if(root.left==null && root.right==null) lst.add(path+root.val);

           if(root.left!=null) findAllPath(root.left,path+root.val+"->",lst);
            if(root.right!=null)findAllPath(root.right,path+root.val+"->",lst);
    }
}