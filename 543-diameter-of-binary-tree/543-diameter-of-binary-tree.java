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
    public int maxDiameter = 0;
    
    public int helper(TreeNode root) {
        if(root == null)
            return -1;
        
        int leftDepth = helper(root.left);
        
        int rightDepth = helper(root.right);
        
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth + 2);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        
        return maxDiameter;
    }
}