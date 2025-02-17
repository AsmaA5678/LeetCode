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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=levelOrder(root);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<list.size();i++){
            result.add(new ArrayList<>());
            if(i%2==0){
                for(int j=0;j<list.get(i).size();j++){
                    result.get(i).add(list.get(i).get(j));
                }
            }else{
                for(int j=list.get(i).size()-1;j>=0;j--){
                    result.get(i).add(list.get(i).get(j));
                }
            }
        }
        return result;
    }
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