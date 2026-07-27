/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
       List<Integer> lst = new ArrayList<>();

        if(root==null) return lst;
         postOrderTrav(root,lst);
         lst.add(root.val);

         return lst;
    }


    public static void postOrderTrav(Node root,List<Integer> res){
        List<Node> l = root.children;

         for(int i=0;i<l.size();i++){
            if(l.get(i)==null){
                continue;
            }

            postOrderTrav(l.get(i),res);
            res.add(l.get(i).val);
         }
    }
}