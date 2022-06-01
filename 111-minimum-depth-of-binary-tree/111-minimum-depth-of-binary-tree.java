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
    int minDepth = Integer.MAX_VALUE;
    
    public int helper(TreeNode root, int currentDepth) {
        if(root == null)
            return Integer.MAX_VALUE;
        
        if(root.left == null && root.right == null)
            return currentDepth;
        
        currentDepth += 1;
        
        return minDepth = Math.min(helper(root.left, currentDepth), helper(root.right, currentDepth));
    }
    
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        return helper(root, 1);
    }
}