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
    public boolean helper(TreeNode tree, long lowerLimit, long upperLimit) {
		if(tree == null) {
			return true;
		}
		
		if(tree.val <= lowerLimit || tree.val >= upperLimit) {
			return false;
		} 
        
		return helper(tree.left, lowerLimit, tree.val) && helper(tree.right, tree.val, upperLimit);
		
	}
    
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}