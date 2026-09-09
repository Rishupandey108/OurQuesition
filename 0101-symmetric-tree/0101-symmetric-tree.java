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
    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        
             Queue<TreeNode> p = new LinkedList<>();
             Queue<TreeNode> q = new LinkedList<>();
            
             p.add(root.left);
             q.add(root.right);
            

            while(!p.isEmpty() &&!q.isEmpty()){

                    TreeNode c1 = p.remove();
                    TreeNode c2 = q.remove();

                    if(c1==null && c2==null){
                        continue;
                    }

                    if(c1==null || c2==null){
                        return false;
                    }

                   if(c1.val != c2.val){
                    return false;
                   }

                   p.add(c1.left);
                   p.add(c1.right);

                     q.add(c2.right);
                     q.add(c2.left);
            }


            return  p.isEmpty()&& q.isEmpty();
         
    }
}