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
    public void helper(TreeNode root, int targetSum, int currentSum, List<Integer> currentPath, List<List<Integer>> result) {
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
        
        helper(root.left, targetSum, currentSum, new ArrayList<>(currentPath), result);
        
        helper(root.right, targetSum, currentSum, new ArrayList<>(currentPath), result);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        helper(root, targetSum, 0, new ArrayList<>(), result);
        
        return result;
    }
}