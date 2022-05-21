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
    List<List<Integer>> result = new ArrayList<>();
    
    public void helper(TreeNode root, int targetSum, int currentSum, List<Integer> currentPath) {
        if(root == null) {
            return;
        }
        
        currentSum += root.val;
        
        currentPath.add(root.val);
        
        if(root.left == null && root.right == null) {
            if(currentSum == targetSum) {
                result.add(new ArrayList<>(currentPath));
            }
            
            return;
        }
        
        helper(root.left, targetSum, currentSum, new ArrayList<>(currentPath));
        
        helper(root.right, targetSum, currentSum, new ArrayList<>(currentPath));
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return new ArrayList<>();
        
        helper(root, targetSum, 0, new ArrayList<>());
        
        return result;
    }
}