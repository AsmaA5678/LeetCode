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
    public TreeNode sortedArrayToBST(int[] nums) {
        return f(nums, 0, nums.length - 1);
    }

    private TreeNode f(int[] nums, int node1, int node2) {
        if (node1 > node2) { 
            return null;
        }   
        int mid = (node1 + node2) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = f(nums, node1, mid - 1);
        root.right = f(nums, mid + 1, node2);
        return root;
    }
}