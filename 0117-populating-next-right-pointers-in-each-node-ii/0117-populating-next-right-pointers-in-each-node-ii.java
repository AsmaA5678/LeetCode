/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        List<List<Node>> levels = levelOrder(root);
        
        for (List<Node> level : levels) {
            for (int i = 0; i < level.size() - 1; i++) {
                level.get(i).next = level.get(i + 1); 
            }
            level.get(level.size() - 1).next = null; 
        }
        
        return root;
    }
    
    public List<List<Node>> levelOrder(Node root) {
        List<List<Node>> result = new ArrayList<>();
        levelOrderRec(root, 0, result);
        return result;
    }
    
    public void levelOrderRec(Node root, int level, List<List<Node>> result) {
        if (root == null) return;
        
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        
        result.get(level).add(root); 
        levelOrderRec(root.left, level + 1, result);
        levelOrderRec(root.right, level + 1, result);
    }
}