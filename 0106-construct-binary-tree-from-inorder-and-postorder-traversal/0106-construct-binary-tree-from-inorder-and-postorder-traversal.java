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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inOrderIndexMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inOrderIndexMap.put(inorder[i],i);
        }
        return split(postorder,inOrderIndexMap,postorder.length-1,0,inorder.length-1);
    }
    public TreeNode split(int[] postorder,HashMap<Integer,Integer> inOrderIndexMap,int rootIndex,int left , int right){
        TreeNode root= new TreeNode(postorder[rootIndex]);
        int mid= inOrderIndexMap.get(postorder[rootIndex]);   
        if (mid < right) {
            root.right = split(postorder, inOrderIndexMap, rootIndex - 1, mid + 1, right);
        }
        if (mid > left) {
            root.left = split(postorder, inOrderIndexMap, rootIndex - (right - mid) - 1, left, mid - 1);
        }    
        return root;
    }
}