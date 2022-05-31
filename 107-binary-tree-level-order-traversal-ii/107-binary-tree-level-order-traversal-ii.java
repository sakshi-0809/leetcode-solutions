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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        
        Queue<TreeNode> elements = new LinkedList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        elements.add(root);
        
        while(!elements.isEmpty()) {
            int size = elements.size();
            
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
                TreeNode current = elements.remove();
                
                level.add(current.val);
                
                if(current.left != null)
                    elements.add(current.left);
                
                if(current.right != null)
                    elements.add(current.right);
            }
            
            result.add(0, level);
        }
        
        return result;
    }
}