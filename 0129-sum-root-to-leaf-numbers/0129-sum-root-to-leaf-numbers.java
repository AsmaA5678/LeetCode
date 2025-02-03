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
    public int sumNumbers(TreeNode root) {
       return sum(root,0); 
    }
    public int sum(TreeNode root,int x){
        if(root==null){
            return 0;
        }
        x=x*10+root.val;
        if(root.left==null && root.right==null){
            return x;
        }
        return sum(root.left,x)+sum(root.right,x);
    }
}