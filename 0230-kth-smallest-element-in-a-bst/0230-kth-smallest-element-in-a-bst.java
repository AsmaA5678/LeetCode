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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=inOrderTraversal(root,new ArrayList<>());
        Collections.sort(list);
        return list.get(k-1);

    }
    public List<Integer> inOrderTraversal(TreeNode node,List<Integer> list) {

        if (node == null) return list;

        inOrderTraversal(node.left,list);   
        list.add(node.val); 
        inOrderTraversal(node.right,list); 

        return list;
    }
}