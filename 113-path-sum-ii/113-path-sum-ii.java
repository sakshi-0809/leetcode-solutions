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
        
        if(root.left == null && root.right == null) {
            if(currentSum + root.val == targetSum) {
                currentPath.add(root.val);
                
                result.add(new ArrayList<>(currentPath));
                
                currentPath.remove(currentPath.size() - 1);
            }
            
            return;
        }
        
        currentPath.add(root.val);
        
        helper(root.left, targetSum, currentSum + root.val, currentPath);
        
        helper(root.right, targetSum, currentSum + root.val, currentPath);
        
        currentPath.remove(currentPath.size() - 1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return new ArrayList<>();
        
        helper(root, targetSum, 0, new ArrayList<>());
        
        return result;
    }
}