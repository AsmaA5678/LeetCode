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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result=new ArrayList<>();
        levelOrderRec(root,0,result);
        return result;
    }
    public void levelOrderRec(TreeNode root, int level, List<List<Integer>> result){
        if(root==null) return;
        if(result.size()<=level) result.add(new ArrayList<>());
        result.get(level).add(root.val);
        levelOrderRec(root.left,level+1,result);
        levelOrderRec(root.right,level+1,result);
    }
}