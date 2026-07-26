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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> Qp = new LinkedList<>();
        Queue<TreeNode> Qq = new LinkedList<>();
        
        Qp.add(p);
        Qq.add(q);

        while(!Qp.isEmpty() && !Qq.isEmpty()){

            TreeNode curr1 = Qp.remove();
            TreeNode curr2 = Qq.remove();

            if(curr1==null && curr2==null){
                continue;
            }

            if(curr1==null || curr2==null){
                return false;
            }

            if(curr1.val!=curr2.val){
                return false;
            }

             


            Qp.add(curr1.left);
            Qp.add(curr1.right);

            Qq.add(curr2.left);
            Qq.add(curr2.right);

            
        }

        boolean result = true;

        result &= Qp.isEmpty();
        result &= Qq.isEmpty();


        return   result;

    }
}