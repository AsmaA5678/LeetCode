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
    int b = Integer.MAX_VALUE;
    int a = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        f(root);
        return a;
    }
    
    public void f(TreeNode root){
        if(root.left!=null) f(root.left);
        a = Math.min(a,Math.abs(root.val-b));
        b = root.val;
        if(root.right!=null) f(root.right);
    }
}