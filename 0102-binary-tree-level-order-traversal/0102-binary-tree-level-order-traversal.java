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
       List<List<Integer>> result= new ArrayList<>();
       if(root==null) return result;
       Queue<TreeNode> queu=new LinkedList<>();
       queu.offer(root);
       while(!queu.isEmpty()){
            List<Integer> currentLevel=new ArrayList<>();
            int currentSize=queu.size();
            for(int i=0;i<currentSize;i++){
                TreeNode current=queu.poll();
                currentLevel.add(current.val);
                if(current.left!=null)queu.offer(current.left);
                if(current.right!=null)queu.offer(current.right);
            }
            result.add(currentLevel);
            
       }
       return result;
    }
}