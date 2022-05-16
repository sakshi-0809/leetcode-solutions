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
    public void preOrder(TreeNode root, ArrayList<TreeNode> list) {
        if(root == null)
            return;
        
        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    
    public void flatten(TreeNode root) {
        // inserting all nodes of tree in pre order in an array list
        
        ArrayList<TreeNode> preOrderList = new ArrayList<>();
        
        preOrder(root, preOrderList);
        
        // changing the tree using array list
        
        for(int i = 0; i < preOrderList.size() - 1; i++) {
            TreeNode current = preOrderList.get(i);
            
            current.left = null;
            current.right = preOrderList.get(i + 1);
        }
    }
}