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
class BSTIterator {

        TreeNode node ;
        Stack<TreeNode> st;
        
    public BSTIterator(TreeNode root) {
        this.node=root;
        st = new Stack<>();
    }
    
    public int next() {
        
        while(node!=null){
            st.push(node);
            node = node.left;
        }

        TreeNode curr = st.pop();
        
        node = curr.right;
        return curr.val;
    }
    
    public boolean hasNext() {
        return node!=null || !st.isEmpty();
    }

    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */